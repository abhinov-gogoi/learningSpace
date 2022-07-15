
#! /bin/sh.

UUID=$(uuidgen)
COMMIT_MESSAGE=$(date +%s)

echo hello world !!!!!!!
echo creating a new file ... 
touch file-$UUID.txt
echo file created ... file-$UUID.txt

git add .
git commit -m "adding a new file for today commit message "+$COMMIT_MESSAGE

git push origin automate

git config --global credential.helper 'cache --timeout 90000000'

sleep 10s 
echo "running script again ... in 10s"
sh script.sh






