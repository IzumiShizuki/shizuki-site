package ya;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c implements ListIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f26007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(lVar);
        this.f26007e = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l lVar = this.f26007e;
        boolean zIsEmpty = lVar.isEmpty();
        b().add(obj);
        lVar.f26016f.f26068e++;
        if (zIsEmpty) {
            lVar.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f25952b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i10) {
        super(lVar, ((List) lVar.f26012b).listIterator(i10));
        this.f26007e = lVar;
    }
}
