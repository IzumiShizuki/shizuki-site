package l2;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b0.d0;
import id.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11706a;

    public c(h hVar) {
        this.f11706a = hVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f11706a.j(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f11706a.m(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((d0) this.f11706a.f9505b).b();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f11706a.n(actionMode, menu);
    }
}
