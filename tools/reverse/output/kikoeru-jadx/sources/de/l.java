package de;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f5930b;

    public l(Object obj, m mVar) {
        this.f5930b = mVar;
        this.f5929a = obj;
    }

    public final Object a(Object obj, pc.u uVar) {
        jc.l.e(uVar, "property");
        return this.f5929a;
    }

    public final void b(Object obj, pc.u uVar) {
        jc.l.e(uVar, "property");
        if (this.f5930b.f5931a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.f5929a = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f5929a + ')';
    }
}
