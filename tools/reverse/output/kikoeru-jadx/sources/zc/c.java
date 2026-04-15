package zc;

import java.util.Map;
import se.a0;
import se.w;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f26677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f26678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f26679c;

    public c(a0 a0Var, Map map, m0 m0Var) {
        if (a0Var == null) {
            d(0);
            throw null;
        }
        if (map == null) {
            d(1);
            throw null;
        }
        this.f26677a = a0Var;
        this.f26678b = map;
        this.f26679c = m0Var;
    }

    public static /* synthetic */ void d(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zc.b
    public final be.c a() {
        yc.e eVarD = ie.d.d(this);
        if (eVarD != null) {
            if (ue.l.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return ie.d.c(eVarD);
            }
        }
        return null;
    }

    @Override // zc.b
    public final w b() {
        w wVar = this.f26677a;
        if (wVar != null) {
            return wVar;
        }
        d(3);
        throw null;
    }

    @Override // zc.b
    public final Map c() {
        Map map = this.f26678b;
        if (map != null) {
            return map;
        }
        d(4);
        throw null;
    }

    @Override // zc.b
    public final m0 m() {
        m0 m0Var = this.f26679c;
        if (m0Var != null) {
            return m0Var;
        }
        d(5);
        throw null;
    }

    public final String toString() {
        return de.i.f5906c.v(this, null);
    }
}
