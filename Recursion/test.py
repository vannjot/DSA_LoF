def count(n):
    if n > 0:
        print(n)
        count(n - 1)
       

count(10)        