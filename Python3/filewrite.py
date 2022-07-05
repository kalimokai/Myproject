file = open (file="./test.py",mode="w", encoding="utf-8", buffering=1)
listpy=["import os\n", "os.system('ls')"]
print(file.writable())
file.close()