package wf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements sf.a {
    @Override // sf.a
    public Object b(vf.b bVar) {
        return i(bVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(vf.b bVar) {
        Object objE = e();
        int iF = f(objE);
        vf.a aVarI = bVar.i(a());
        while (true) {
            int iB = aVarI.b(a());
            if (iB == -1) {
                aVarI.j(a());
                return l(objE);
            }
            j(aVarI, iB + iF, objE);
        }
    }

    public abstract void j(vf.a aVar, int i10, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
