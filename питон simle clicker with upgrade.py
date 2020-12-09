from tkinter import*
#from PIL import Image,ImsgeTk
#from tkinter import Tk
root=Tk()
root.title('first blood')
i=0
root.geometry('100x100')
def fu():
    global i
    i=i+1
    l1['text']= i
    if  i>10:
     button1.config(bg="green")
     button1.config(activebackground="green")
    if i>30 :
         l1.config(bg='red')
    if i>50:
         frame1.config(bg='yellow')
  #  if i>100:
      #  imgageFile='animeislife.jpg'
      # window.im1=Image.open(imageFile)
        #raw_input()
        #window.mainloop()


frame1=Frame(root,bg='blue',bd=5)
button1=Button(frame1,text='Click', command=fu)

f1 = LabelFrame(root, text= 'your click')
l1 = Label(f1, width=2, height=2, bg='white')
f1.pack()

l1.pack()
frame1.pack()
button1.pack()
root.mainloop()
