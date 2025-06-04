@echo off
echo ===== CS61B 一键提交流程开始 =====

:: 查看当前状态
git status

:: 暂存所有改动
git add .

:: 提交，带上时间戳避免重名
set /p msg=请输入提交信息：
git commit -m "%msg%"

:: 拉取远程更新防冲突
git pull --rebase origin main

:: 推送到 GitHub
git push -u origin main

echo ===== 提交流程结束！去 Gradescope 提交吧 =====
pause
