.class public final Lm5/i;
.super Lm4/n1;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public final K:Landroid/util/SparseArray;

.field public final L:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Lm4/n1;-><init>()V

    .line 58
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lm5/i;->K:Landroid/util/SparseArray;

    .line 59
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lm5/i;->L:Landroid/util/SparseBooleanArray;

    .line 60
    invoke-virtual {p0}, Lm5/i;->g()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lm4/n1;-><init>()V

    .line 2
    sget v0, Lp4/c0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    const-string v2, "captioning"

    .line 4
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/CaptioningManager;

    if-eqz v2, :cond_2

    .line 5
    invoke-virtual {v2}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0x440

    .line 6
    iput v3, p0, Lm4/n1;->v:I

    .line 7
    invoke-virtual {v2}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v2}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-static {v2}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v2

    iput-object v2, p0, Lm4/n1;->u:Lya/i0;

    .line 10
    :cond_2
    :goto_0
    const-string v2, "display"

    .line 11
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/display/DisplayManager;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 12
    invoke-virtual {v2, v3}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_4

    .line 13
    const-string v2, "window"

    .line 14
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 17
    :cond_4
    invoke-virtual {v2}, Landroid/view/Display;->getDisplayId()I

    move-result v4

    if-nez v4, :cond_8

    invoke-static {p1}, Lp4/c0;->L(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x1c

    if-ge v0, v4, :cond_5

    .line 18
    const-string v4, "sys.display-size"

    invoke-static {v4}, Lp4/c0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    .line 19
    :cond_5
    const-string v4, "vendor.display-size"

    invoke-static {v4}, Lp4/c0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 20
    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 21
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "x"

    const/4 v7, -0x1

    .line 22
    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 23
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_6

    .line 24
    aget-object v3, v5, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v6, 0x1

    .line 25
    aget-object v5, v5, v6

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-lez v3, :cond_6

    if-lez v5, :cond_6

    .line 26
    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v3, v5}, Landroid/graphics/Point;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 27
    :catch_0
    :cond_6
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Invalid display size: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Util"

    invoke-static {v4, v3}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    :cond_7
    const-string v3, "Sony"

    sget-object v4, Lp4/c0;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Lp4/c0;->d:Ljava/lang/String;

    const-string v4, "BRAVIA"

    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v3, "com.sony.dtv.hardware.panel.qfhd"

    invoke-virtual {p1, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 31
    new-instance p1, Landroid/graphics/Point;

    const/16 v0, 0xf00

    const/16 v1, 0x870

    invoke-direct {p1, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    :goto_3
    move-object v6, p1

    goto :goto_4

    .line 32
    :cond_8
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    if-lt v0, v1, :cond_9

    .line 33
    invoke-static {v2}, Lk1/f;->e(Landroid/view/Display;)Landroid/view/Display$Mode;

    move-result-object v0

    .line 34
    invoke-static {v0}, Lk1/f;->a(Landroid/view/Display$Mode;)I

    move-result v1

    iput v1, p1, Landroid/graphics/Point;->x:I

    .line 35
    invoke-static {v0}, Lk1/f;->x(Landroid/view/Display$Mode;)I

    move-result v0

    iput v0, p1, Landroid/graphics/Point;->y:I

    goto :goto_3

    .line 36
    :cond_9
    invoke-virtual {v2, p1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    goto :goto_3

    .line 37
    :goto_4
    iget p1, v6, Landroid/graphics/Point;->x:I

    iget v0, v6, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, p1, v0}, Lm5/i;->f(II)Lm4/n1;

    .line 38
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lm5/i;->K:Landroid/util/SparseArray;

    .line 39
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lm5/i;->L:Landroid/util/SparseBooleanArray;

    .line 40
    invoke-virtual {p0}, Lm5/i;->g()V

    return-void
.end method

.method public constructor <init>(Lm5/j;)V
    .locals 6

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p0, p1}, Lm4/n1;->d(Lm4/o1;)V

    .line 43
    iget-boolean v0, p1, Lm5/j;->k0:Z

    iput-boolean v0, p0, Lm5/i;->D:Z

    .line 44
    iget-boolean v0, p1, Lm5/j;->l0:Z

    iput-boolean v0, p0, Lm5/i;->E:Z

    .line 45
    iget-boolean v0, p1, Lm5/j;->m0:Z

    iput-boolean v0, p0, Lm5/i;->F:Z

    .line 46
    iget-boolean v0, p1, Lm5/j;->n0:Z

    iput-boolean v0, p0, Lm5/i;->G:Z

    .line 47
    iget-boolean v0, p1, Lm5/j;->o0:Z

    iput-boolean v0, p0, Lm5/i;->H:Z

    .line 48
    iget-boolean v0, p1, Lm5/j;->p0:Z

    iput-boolean v0, p0, Lm5/i;->I:Z

    .line 49
    iget-boolean v0, p1, Lm5/j;->q0:Z

    iput-boolean v0, p0, Lm5/i;->J:Z

    .line 50
    iget-object v0, p1, Lm5/j;->r0:Landroid/util/SparseArray;

    .line 51
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    const/4 v2, 0x0

    .line 52
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 53
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    new-instance v4, Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 54
    :cond_0
    iput-object v1, p0, Lm5/i;->K:Landroid/util/SparseArray;

    .line 55
    iget-object p1, p1, Lm5/j;->s0:Landroid/util/SparseBooleanArray;

    .line 56
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clone()Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Lm5/i;->L:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public final a(Lm4/k1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm4/n1;->B:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p1, Lm4/k1;->a:Lm4/j1;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final b()Lm4/o1;
    .locals 1

    .line 1
    new-instance v0, Lm5/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lm5/j;-><init>(Lm5/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final c()Lm4/n1;
    .locals 0

    .line 1
    invoke-super {p0}, Lm4/n1;->c()Lm4/n1;

    .line 2
    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final f(II)Lm4/n1;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lm4/n1;->f(II)Lm4/n1;

    .line 2
    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm5/i;->D:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lm5/i;->E:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lm5/i;->F:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lm5/i;->G:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lm5/i;->H:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lm5/i;->I:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lm5/i;->J:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
