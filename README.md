# GitHubSetup

Start cmd
go to directory where selenium server jar is installed

to start the hub go tp selenium sever directory on CMD and enter below cmd
CMD to start the hub:
C:\SeleniumServer2018>java -jar selenium-server-standalone-3.12.0.jar -role hub

CMD to start NODE(here we are mentioning 3 things 1) path of chrme driver 2) seenium server detail where hub is register 3) hub detail
First go to directory where selenium server i.e. jar file path and enter below cmd:
C:\SeleniumServer2018>java -Dwebdriver.chrome.driver="C:\BrowserDrivers\chromedriver.exe" -jar selenium-server-standalone-3.12.0.jar -role node -hub http://10.0.0.133:4444/grid/register
