package s3;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f19364c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f19362a, bVar.f19362a) && Objects.equals(this.f19363b, bVar.f19363b) && Objects.equals(this.f19364c, bVar.f19364c);
    }

    public final int hashCode() {
        return Objects.hash(this.f19362a, this.f19363b, this.f19364c);
    }
}
