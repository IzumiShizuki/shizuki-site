package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends k0 {
    public abstract Object a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof f0) {
            string = "\"" + ((Object) ((f0) this).f8384a) + '\"';
        } else {
            string = a().toString();
        }
        return q.t0.E(sb, string, ')');
    }
}
