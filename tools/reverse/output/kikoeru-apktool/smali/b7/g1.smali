.class public final synthetic Lb7/g1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/h1;
.implements Lb7/n2;
.implements Lp4/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb7/g1;->a:I

    iput-object p2, p0, Lb7/g1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb7/g1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lb7/o2;Lc7/q0;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/g1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb7/g1;->c:Ljava/lang/Object;

    iput p3, p0, Lb7/g1;->a:I

    return-void
.end method

.method public synthetic constructor <init>(Lb7/p1;ILb7/v1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/g1;->b:Ljava/lang/Object;

    iput p2, p0, Lb7/g1;->a:I

    iput-object p3, p0, Lb7/g1;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/g1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm4/x0;

    .line 4
    .line 5
    iget-object v1, p0, Lb7/g1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lm4/x0;

    .line 8
    .line 9
    check-cast p1, Lm4/w0;

    .line 10
    .line 11
    iget v2, p0, Lb7/g1;->a:I

    .line 12
    .line 13
    invoke-interface {p1, v2}, Lm4/w0;->e(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0, v1, v2}, Lm4/w0;->g(Lm4/x0;Lm4/x0;I)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public b(Lb7/t1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb7/g1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/o2;

    .line 4
    .line 5
    iget-object v1, p0, Lb7/g1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc7/q0;

    .line 8
    .line 9
    iget-object v2, v1, Lc7/q0;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const-string p1, "MediaSessionLegacyStub"

    .line 18
    .line 19
    const-string v0, "onAddQueueItem(): Media ID shouldn\'t be empty"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {v1}, Lb7/x;->h(Lc7/q0;)Lm4/i0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, v0, Lb7/o2;->g:Lb7/c2;

    .line 30
    .line 31
    invoke-static {v1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v2, p1, v1}, Lb7/c2;->j(Lb7/t1;Ljava/util/List;)Lcb/y;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Lah/j;

    .line 40
    .line 41
    iget v3, p0, Lb7/g1;->a:I

    .line 42
    .line 43
    invoke-direct {v2, v0, p1, v3}, Lah/j;-><init>(Lb7/o2;Lb7/t1;I)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lcb/t;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-direct {p1, v0, v1, v2}, Lcb/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lcb/r;->a:Lcb/r;

    .line 53
    .line 54
    invoke-interface {v1, p1, v0}, Lcb/y;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 55
    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public c(Lb7/t0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb7/g1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/e4;

    .line 4
    .line 5
    iget-object v1, p0, Lb7/g1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/os/Bundle;

    .line 8
    .line 9
    iget-object v2, p1, Lb7/t0;->a:Lb7/d0;

    .line 10
    .line 11
    invoke-virtual {p1}, Lb7/t0;->T()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, v2, Lb7/d0;->d:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-ne v3, v4, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x0

    .line 36
    :goto_0
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v2, Lb7/d0;->c:Lb7/b0;

    .line 40
    .line 41
    invoke-interface {v3, v2, v0, v1}, Lb7/b0;->v(Lb7/d0;Lb7/e4;Landroid/os/Bundle;)Lcb/v;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lb5/n;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    iget v3, p0, Lb7/g1;->a:I

    .line 49
    .line 50
    invoke-direct {v1, p1, v0, v3, v2}, Lb5/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget-object p1, Lcb/r;->a:Lcb/r;

    .line 54
    .line 55
    invoke-virtual {v0, v1, p1}, Lcb/v;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
