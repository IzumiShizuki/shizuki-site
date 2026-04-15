package ed;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import yc.b1;
import yc.e1;
import yc.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends s implements sd.b, sd.c {
    @Override // sd.b
    public final e a(be.c cVar) {
        jc.l.e(cVar, "fqName");
        Member memberB = b();
        jc.l.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return g8.a.u(declaredAnnotations, cVar);
        }
        return null;
    }

    public abstract Member b();

    public final be.e c() {
        String name = b().getName();
        return name != null ? be.e.e(name) : be.g.f2755a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.w.d(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final e1 e() {
        int modifiers = b().getModifiers();
        return Modifier.isPublic(modifiers) ? b1.f26096c : Modifier.isPrivate(modifiers) ? y0.f26161c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? cd.c.f3891c : cd.b.f3890c : cd.a.f3889c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && jc.l.a(b(), ((w) obj).b());
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        Member memberB = b();
        jc.l.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? g8.a.z(declaredAnnotations) : vb.r.f22819a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
