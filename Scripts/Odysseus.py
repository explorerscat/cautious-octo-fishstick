
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
    zh = translate(content, ENGLISH, CHINESE)
    eng = translate(zh, JAPANESE, ENGLISH)
    try:
        content = engchk(eng)
    except:
        content = translate(eng, CHINESE, ENGLISH)
    with open(target, 'w') as f:
        f.write(content)

hooks = [tr_hook]

