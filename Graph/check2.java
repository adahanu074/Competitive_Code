logging:
  level:
    org:
      hibernate:
        type: trace
management:
  endpoint:
    health:
      show-details: always
  health:
    datasource:
      enabled: true
oauth:
  myProfileUrl: https://identitybts.webex.com/identity/scim/v1/Users/me/
  oauth2Url: https://idbrokerbts.webex.com/idb/oauth2/v1/tokeninfo
  resourceId: Cb541c6c064bd0e997652335ea84f644437c6ddf470a503f6ae9699836b0b8c06
  resourceSecret: a07a68959f496d70d34b96704ecc846fcba5dc6cca61caa32570046472ea0552
qlik:
  certBasePath: classpath:cert
  proxyCertPass: Cisco123
  rootCertPass: Cisco123
  vproxy: custportal
  xrfkey: 7rBHABt65vFflaZ7
spring:
    datasource:
        bts:
            mysql:		     
                driver-class-name: com.mysql.cj.jdbc.Driver		       
                password: Em3F!-fY		         
                url: jdbc:mysql://rpbt1flu002.webex.com:3306/videomesh?useSSL=false		       
                username: videomesh		         
        prod:
            mysql:
                    driver-class-name: com.mysql.cj.jdbc.Driver
                    password: Em3F!-fY
                    url: jdbc:mysql://rpsj1flu003.webex.com:3306/videomesh?useSSL=false
                    username: videomesh	   
    jpa:
        hibernate:
            ddl-auto: update
        properties:
            hibernate:
                dialect: org.hibernate.dialect.MySQL5Dialect
                format_sql: true
        show-sql: true    