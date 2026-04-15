package re;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19004d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.f19001a = i10;
        this.f19002b = obj;
        this.f19003c = obj2;
        this.f19004d = obj3;
    }

    public static /* synthetic */ void f(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "compute";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i10 != 3 && i10 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:20:0x0056, B:23:0x0061, B:25:0x0067, B:27:0x006b, B:32:0x0076, B:33:0x0079, B:35:0x007c, B:37:0x0082, B:39:0x0086, B:40:0x0089, B:41:0x008c, B:43:0x008f, B:57:0x00b3, B:61:0x00bf, B:62:0x00c3, B:63:0x00c4, B:64:0x00c6, B:69:0x00cf, B:71:0x00da, B:72:0x00de, B:73:0x00df, B:74:0x00e2, B:76:0x00e6, B:77:0x00e9, B:79:0x00eb, B:80:0x00ef, B:66:0x00c8, B:67:0x00cc, B:46:0x0096, B:50:0x00a5, B:54:0x00ad, B:55:0x00b1, B:59:0x00b9, B:75:0x00e3), top: B:83:0x0056, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // ic.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: re.j.a(java.lang.Object):java.lang.Object");
    }

    public AssertionError h(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + k.f19006b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((l) this.f19002b));
        l.e(assertionError);
        return assertionError;
    }

    public AssertionError i(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((l) this.f19002b));
        l.e(assertionError);
        return assertionError;
    }

    public AssertionError j(Object obj, Throwable th2) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((l) this.f19002b), th2);
        l.e(assertionError);
        return assertionError;
    }
}
