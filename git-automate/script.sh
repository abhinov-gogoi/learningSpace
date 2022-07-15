
#! /bin/sh.

UUID=$(uuidgen)

echo hello world !!!!!!!
echo creating a new file ... 
touch file-$UUID.txt
echo file created ... file-$UUID.txt

git add .
git commit -m "adding a new file for today $(date +%s)"

git push origin automate

git config --global credential.helper 'cache --timeout 90000000'






