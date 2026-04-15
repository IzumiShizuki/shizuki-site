package c1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3205c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f3203a = i10;
        this.f3204b = obj;
        this.f3205c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f3203a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && jc.l.a(entry.getKey(), this.f3204b) && jc.l.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f3203a) {
        }
        return this.f3204b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f3203a) {
        }
        return this.f3205c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f3203a) {
            case 0:
                Object obj = this.f3204b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f3203a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f3203a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f3204b);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
