
#! /bin/sh.

UUID=$(uuidgen)

echo hello world !!!!!!!
echo creating a new file ... 
touch file-$MAX.txt
echo file created ... file-$MAX.txt

git add .
git commit -m "adding a new file for today"

git push origin main
abhi
1234





