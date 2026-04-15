package ya;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends m0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f25985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g1 f25986j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f25987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f25989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f25990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f25991h;

    static {
        Object[] objArr = new Object[0];
        f25985i = objArr;
        f25986j = new g1(0, 0, 0, objArr, objArr);
    }

    public g1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f25987d = objArr;
        this.f25988e = i10;
        this.f25989f = objArr2;
        this.f25990g = i11;
        this.f25991h = i12;
    }

    @Override // ya.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f25989f;
            if (objArr.length != 0) {
                int iS = q.s(obj);
                while (true) {
                    int i10 = iS & this.f25990g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iS = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // ya.m0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25988e;
    }

    @Override // ya.d0
    public final int i(int i10, Object[] objArr) {
        Object[] objArr2 = this.f25987d;
        int i11 = this.f25991h;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // ya.d0
    public final Object[] j() {
        return this.f25987d;
    }

    @Override // ya.d0
    public final int k() {
        return this.f25991h;
    }

    @Override // ya.d0
    public final int l() {
        return 0;
    }

    @Override // ya.d0
    public final boolean m() {
        return false;
    }

    @Override // ya.d0
    /* JADX INFO: renamed from: n */
    public final o1 iterator() {
        return a().listIterator(0);
    }

    @Override // ya.m0
    public final i0 r() {
        return i0.o(this.f25991h, this.f25987d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25991h;
    }
}
