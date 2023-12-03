def binary_search(arr,start,end,item):
    if end>=start:
        mid = (start+end)//2

        if arr[mid] == item:
            return mid

        elif arr[mid] > item:
            return binary_search(arr,start,mid-1,item)
        
        elif arr[mid] < item:
            return binary_search(arr,mid+1,end,item)
        else:
            return -1
        
arr = [2,4,6,8,10,12,14,16]
item = 6
result = binary_search(arr,0,len(arr)-1,item)

if result != -1:
    print("Elements found on index: ",str(result))
else:
    print("Elements not found")