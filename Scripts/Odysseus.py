
import subprocess

xlat = None

ENGLISH = 'en' # English
CHINESE = 'zh' # Mandarin Chinese
JAPANESE = 'ja' # Japanese

def tr_hook(target="Fun.md"):
    global xlat
    with open(target, 'r') as f:
        content = f.read()
    if xlat is None:
        from argostranslate.translate import translate
        xlat = translate
    engchk = lambda eng: eng.encode('ascii').decode('ascii') # Sort of works
    zh = xlat(content, ENGLISH, CHINESE)
    eng = xlat(zh, JAPANESE, ENGLISH)
    try:
        content = engchk(eng)
    except:
        content = xlat(eng, CHINESE, ENGLISH)
    with open(target, 'w') as f:
        f.write(content)

def j_hook(target="https://zh.wikipedia.org/wiki/ITZY", out="T.md"):
    global xlat
    zh = subprocess.run(['curl', target], capture_output=True).stdout
    if xlat is None:
        from argostranslate.translate import translate
        xlat = translate
    content = xlat(zh, JAPANESE, ENGLISH)
    with open(out, 'w') as f:
        f.write(content)

hooks = [tr_hook, j_hook] # TODO: add more

