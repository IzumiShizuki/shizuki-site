package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 implements Runnable, Comparable, n0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8588b = -1;

    public s0(long j10) {
        this.f8587a = j10;
    }

    @Override // hf.n0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                app.nekogram.translator.r rVar = a0.f8509b;
                if (obj == rVar) {
                    return;
                }
                t0 t0Var = obj instanceof t0 ? (t0) obj : null;
                if (t0Var != null) {
                    t0Var.b(this);
                }
                this._heap = rVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final nf.w b() {
        Object obj = this._heap;
        if (obj instanceof nf.w) {
            return (nf.w) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f8587a - ((s0) obj).f8587a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    public final int d(long j10, t0 t0Var, u0 u0Var) {
        synchronized (this) {
            if (this._heap == a0.f8509b) {
                return 2;
            }
            synchronized (t0Var) {
                try {
                    s0[] s0VarArr = t0Var.f15862a;
                    s0 s0Var = s0VarArr != null ? s0VarArr[0] : null;
                    if (u0.f8596i.get(u0Var) == 1) {
                        return 1;
                    }
                    if (s0Var == null) {
                        t0Var.f8592c = j10;
                    } else {
                        long j11 = s0Var.f8587a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - t0Var.f8592c > 0) {
                            t0Var.f8592c = j10;
                        }
                    }
                    long j12 = this.f8587a;
                    long j13 = t0Var.f8592c;
                    if (j12 - j13 < 0) {
                        this.f8587a = j13;
                    }
                    t0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void e(t0 t0Var) {
        if (this._heap == a0.f8509b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = t0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8587a + ']';
    }
}
