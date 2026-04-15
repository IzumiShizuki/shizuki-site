package ed;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends s implements sd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f6486a;

    public c0(TypeVariable typeVariable) {
        jc.l.e(typeVariable, "typeVariable");
        this.f6486a = typeVariable;
    }

    @Override // sd.b
    public final e a(be.c cVar) {
        Annotation[] declaredAnnotations;
        jc.l.e(cVar, "fqName");
        TypeVariable typeVariable = this.f6486a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return g8.a.u(declaredAnnotations, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return jc.l.a(this.f6486a, ((c0) obj).f6486a);
        }
        return false;
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f6486a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? vb.r.f22819a : g8.a.z(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f6486a.hashCode();
    }

    public final String toString() {
        return c0.class.getName() + ": " + this.f6486a;
    }
}
