package eb;

import ce.j0;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f6472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f6473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y[] f6474c;

    static {
        u uVar = new u();
        f6472a = uVar;
        v vVar = new v();
        f6473b = vVar;
        f6474c = new y[]{uVar, vVar, new y() { // from class: eb.w
            public static Double b(String str, mb.a aVar) throws mb.c {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (aVar.f15080o != 1) {
                            throw new mb.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.u(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    StringBuilder sbK = a0.c.K("Cannot parse ", str, "; at path ");
                    sbK.append(aVar.u(true));
                    throw new j0(sbK.toString(), e10);
                }
            }

            @Override // eb.y
            public final Number a(mb.a aVar) throws IOException {
                String strF0 = aVar.f0();
                if (strF0.indexOf(46) >= 0) {
                    return b(strF0, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strF0));
                } catch (NumberFormatException unused) {
                    return b(strF0, aVar);
                }
            }
        }, new y() { // from class: eb.x
            @Override // eb.y
            public final Number a(mb.a aVar) throws IOException {
                String strF0 = aVar.f0();
                try {
                    return gb.d.i(strF0);
                } catch (NumberFormatException e10) {
                    StringBuilder sbK = a0.c.K("Cannot parse ", strF0, "; at path ");
                    sbK.append(aVar.u(true));
                    throw new j0(sbK.toString(), e10);
                }
            }
        }};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f6474c.clone();
    }

    public abstract Number a(mb.a aVar);
}
