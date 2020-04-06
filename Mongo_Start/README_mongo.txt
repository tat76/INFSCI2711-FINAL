MongoDB Database Access info
username: adbfinal
password: 11223344

How to access data in MongoDB Altas cloud service:
- download mongo shell using brew
    $ brew install mongodb-community@4.2
- connect the mongo shell to the cloud
    open a new terminal
    $ mongo "mongodb+srv://cluster0-yqrqb.mongodb.net/test"  --username adbfinal

    asking for key:
      [type password 11223344]
- make sure you are working in database adbfinal
  > use adbfinal
