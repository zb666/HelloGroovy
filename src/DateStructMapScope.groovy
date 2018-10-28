def list = [1, 2, 3, 4, 5]
println list.class
//列表
def array = [1, 2, 3, 4, 5] as int[]
//这是强类型的声明方式
int[] array2 = [1, 2, 3, 4, 5]

//映射 如何定义Map
//def map = new HashMap()
def colors = [red  : 'ff0000',
              green: '00ff00']
//元素读取
println colors['red']
println colors.green

//添加元素  //可以添加任意类型的对象
colors.yellow = 'fffffff'
colors.leftShift([yellow:'0xff00'])
colors.complex = [a:1,b:2]
println colors.toMapString()

println colors.getClass()