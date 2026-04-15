package i1;

import java.util.List;
import jc.l;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8641a;

    public e(List list) {
        this.f8641a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        wb.b bVarL = ud.b.l();
        ef.i iVarQ = m.Q(this.f8641a);
        if (iVarQ.a() > 0) {
            ((b) iVarQ.get(0)).getClass();
            throw null;
        }
        ef.i iVarQ2 = m.Q(ud.b.g(bVarL));
        int iA = iVarQ2.a();
        for (int i10 = 0; i10 < iA; i10++) {
            sb.append("\tat " + ((String) iVarQ2.get(i10)));
            sb.append('\n');
        }
        String string = sb.toString();
        l.d(string, "toString(...)");
        return string;
    }
}
