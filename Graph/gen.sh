#!/bin/bash
####################################################################
# script to generate bearer token that can be used for api requests.
# Author : Shreenivas Rathi(shrathi)
####################################################################

#USER="hsblrindia1usprod-mac-acc";
#PASS="ABYP.qhxm.12.FHIL.qrvp.14.CGJN.bcsu.1235";
#ORG_ID="a36d3bcb-e2bd-4591-a38e-23c1290dbf51";

USER="mediafusion-hs-machine-account-prod";
PASS="QSUX.gyjo.29.BSYM.qtxp.49.BCEN.rxmn.1689";
ORG_ID="27f564b5-37f4-4b2d-a896-622ebb973506";



CLIENT_ID="Ce79ecb9060a06a59476f5ecdcf431981082b44f0a4fe7fe246bb9264b7230e3c";
CLIENT_SECRET="009abd31722d0dbd4c3d32aa39d11654bdd04d947e6e2a95ad6937abff9c489c";

ID_HOST="https://idbroker.webex.com";

BEARER_TOKEN_API="/idb/token/$ORG_ID/v1/actions/GetBearerToken/invoke";
BEARER_DATA="{\"name\":\"$USER\", \"password\": \"$PASS\"}";

BEARER_TOKEN=`curl -sS -H "Content-Type:application/json" -X POST -d "$BEARER_DATA" $ID_HOST$BEARER_TOKEN_API`
BEARER_TOKEN=`echo "$BEARER_TOKEN" | jq .BearerToken`

ACCESS_DATA="grant_type=urn%3Aietf%3Aparams%3Aoauth%3Agrant-type%3Asaml2-bearer&assertion=$BEARER_TOKEN&scope=squared-fusion-mgmt%3Amanagement%20spark-admin%3Ahybrid_clusters_read%20spark-admin%3Ahybrid_connectors_read";
ACCESS_TOKEN_API="/idb/oauth2/v1/access_token"
BASE64_DATA=`echo -ne "$CLIENT_ID:$CLIENT_SECRET" | base64 | tr -d '\n'`
BASIC_AUTH="Authorization: Basic $BASE64_DATA"

ACCESS_TOKEN=`curl -Ssk -H "$BASIC_AUTH" -X POST -d "$ACCESS_DATA" $ID_HOST$ACCESS_TOKEN_API`

if [[ $? -eq 0  && "$ACCESS_TOKEN" =~ "access_token" ]]; then
	ACCESS_TOKEN=`echo $ACCESS_TOKEN | sed -E s'/^.*access_token":[ \t\n]{0,}\"//g' | sed -E s'/\".*//'`
	echo $ACCESS_TOKEN;
else
	echo -e "ERROR: Failed to get access token, aborting.\n$ACCESS_TOKEN"
	exit -2;
fi


exit 0;