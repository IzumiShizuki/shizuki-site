package ch;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f4198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4199c;

    public /* synthetic */ k(p pVar, int i10, Object obj, int i11) {
        this.f4197a = i11;
        this.f4198b = pVar;
        this.f4199c = i10;
    }

    private final Object f() {
        p pVar = this.f4198b;
        int i10 = this.f4199c;
        pVar.f4221k.getClass();
        try {
            pVar.f4233w.q(i10, b.f4152h);
            synchronized (pVar) {
                pVar.f4235y.remove(Integer.valueOf(i10));
            }
        } catch (IOException unused) {
        }
        return ub.a0.f21526a;
    }

    private final Object h() {
        p pVar = this.f4198b;
        int i10 = this.f4199c;
        pVar.f4221k.getClass();
        synchronized (pVar) {
            pVar.f4235y.remove(Integer.valueOf(i10));
        }
        return ub.a0.f21526a;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f4197a) {
            case 0:
                return f();
            case 1:
                return h();
            default:
                p pVar = this.f4198b;
                int i10 = this.f4199c;
                pVar.f4221k.getClass();
                try {
                    pVar.f4233w.q(i10, b.f4152h);
                    synchronized (pVar) {
                        pVar.f4235y.remove(Integer.valueOf(i10));
                    }
                } catch (IOException unused) {
                }
                return ub.a0.f21526a;
        }
    }

    public /* synthetic */ k(p pVar, int i10, List list, boolean z10) {
        this.f4197a = 2;
        this.f4198b = pVar;
        this.f4199c = i10;
    }
}
