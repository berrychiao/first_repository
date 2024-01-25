
@ECHO OFF
setlocal EnableDelayedExpansion
color 3e
title 添加服务配置
 
PUSHD %~DP0 & cd /d "%~dp0"
%1 %2
mshta vbscript:createobject("shell.application").shellexecute("%~s0","goto :runas","","runas",1)(window.close)&goto :eof
:runas
set JDK_PATH=D:\jdk17\bin
%JDK_PATH%\javac -encoding utf8 WebPageFetcher.java   
%JDK_PATH%\java WebPageFetcher

ipconfig /flushdns
timeout /t 3600