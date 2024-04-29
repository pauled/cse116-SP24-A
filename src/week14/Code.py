class GameItem:
    # Instance attribute
    def __init__(self, x,y):
        self.xLoc = x
        self.yLoc = y

    def __str__(self):
        return "("+str(self.xLoc)+","+str(self.yLoc)+")"
    def move(self,x,y):
        self.xLoc+=x
        self.yLoc+=y
class Weapon(GameItem):
    def __init__(self, x, y, damage):
        super().__init__(x, y)
        self.damage=damage
    def __str__(self):
        temp=super().__str__()
        return temp+" damage: "+str(self.damage)
    def getDamage(self):
        return self.damage

gi=GameItem(1,2)
print(gi)
gi.move(1,2)
print(gi)
gi2=Weapon(3,4,5)
print(gi2)
gi2.move(1,2)
print(gi2)
al=[gi,gi2]
for item in al:
    item.move(10,10)
    print(" "+str(item))
    print(type(item))
    print(item.getDamage())