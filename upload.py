import os, time, datetime

def getPracs():
    nums = input("Prácticas => ")
    nums = nums.split()
    pracs = [f"EVA3_{num}_*" for num in nums]
    pracs = ' '.join(pracs)
    return pracs

def getCommitName():
    time_aux = datetime.datetime.now()
    time_now = time_aux.strftime("%Y-%m-%d %H:%M:%S")
    date = time_now[5:10]
    return f'git commit -m "Prácticas hasta {date}"'

def makeDiagrams():
    print("under maintenance")

def run():
    #gitadd = f"git add {getPracs()}"
    gitadd = "git add *"
    gitcommit = getCommitName()
    copy_token = f'cat ../token | xclip -selection clipboard'

    os.system(gitadd)
    os.system(gitcommit) 
    os.system("git push -u origin main")
    os.system(copy_token)

run()




