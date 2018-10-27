def list = [1, 2, 3, 4, 5]
println list.class
println list.size()
println '--------华丽的分割线--------'
def findList = [-3, 9, 6, 2]
int result = findList.find {
    return it % 2 == 0
}
def findAll = findList.findAll {
    return it % 2 == 0
}
findList.count {
    return it >= 60
}
println result
println findAll

//======= 列表详解 =================

