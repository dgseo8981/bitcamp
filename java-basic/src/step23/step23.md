#
##포트번호  
0 ~ 1023 잘 알려진 포트  
 -특정 프로그램이 관습적으로 사용하는 포트 번호.  
 -프로그램을 작성할 떄 가능한 이 포트 번호를 사용하지 말아야 한다.  
 -7(echo), 20(FTP 데이터 포트), 21(FTP 제어포트), 23(telnet)  
  25(SMTP), 53(DNS), 80(http), 110(POP3), 143(IMAP) 등  
  
1024 ~ 49151 등록된 포트  
 -일반적인 통신 프로그램을 작성할 때 이 범위 포트 번호를 사용한다.  
 -다만 이 범위에 번호 중에서 특정 프로그램이 널리 사용하는 번호가 있다.  
 -8080(proxy), 1521(Oracle), 3305(MySQL) 등  
  
49152 ~ 65535 동적 포트  
 -통신을 하는 프로그램은 반드시 포트번호를 가져야 한다.  
  그래야 OS가 해등 프로그램을 구분할 수 있다.  
 -따라서 클라이언트 프로그램도 포트 번호를 갖는데, 프로그램에서 결정하는 것이 아니라, OS로부터 자동 발급 받는다. 
 
##연결 방식  
connectionless 방식 : 서버에 작업을 요청할 때 연결하고, 서버로부터 응답을 받으면 연결을 끊는다.  
단점 : 매번 요청할 때마다 서버에 연결해야 하기 때문에 실행 시간이 많이 걸린다.  
실행시간 = 연결하는데 걸린 시간 + 데이터 전송 시간 + 서버 처리 시간 + 데이터 수신 시간  
특히 서버에 연결하는데 시간이 많이 걸리기 때문에 실행 시간이 많이 소요된다.  
장점 : 서버에 계속 연결된 상태가 아니기 때문에 서버 입장에서는 메모리를 많이 사용하지 않는다. 그래서 같은 메모리라도 connectionful 방식 보다 더 많은 클라이언트 요청을 처리할 수 있다.  
예) HTTP 통신 - 웹브라우저가 서버에 연결한 후 요청을 하고 서버가 응답한 후 연결을 끊는다. / 메신저 - 메신저 서버에 연결하고 메시지 전송 후 연결 끊는다. / 메일 전송 - 메일서버에 데이터 전송 후 연결 끊는다.  
  
connectionful 방식 : 한 번 연결한 후 여러번 요청/응답하는 방식  
단점 : 한번 연결하면 클라이언트가 연결을 끊을 때까지 계속 유지한다.  
클라이언트가 작업을 요청하지 않더라도 계속 연결 정보를 유지해야 하기 때문에 메모리를 많이 차지하고 동시에 많은 클라이언트의 요청을 처리하기 힘들다.  
장점 : 한 번 서버에 연결되면 클라이언트가 연결을 끊을 떄까지 유지되기 때문에 작업을 처리하는 속도가 빠르다. 클라이언트의 작업 상태를 계속 유지할 수 있기 때문에 stateful 방식이라 부른다.  
작업처리하는데 걸리는 시간 = 데이터 전송시간 + 작업 처리 시간 + 데이터 수신 시간  
즉, 작업을 요청할 떄까지 연결할 필요가 없기 때문에 연결하는데 시간이 걸리지 않는다.  
예) 게임 / 화상 통신 / 채팅 서버 / 텔넷: 원격제어 / FTP  