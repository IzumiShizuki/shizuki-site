.class public final Lb7/a1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final a:Lc7/h0;

.field public b:Lb5/b;

.field public c:Lc7/i0;

.field public final d:Landroid/os/Handler;

.field public final synthetic e:Lb7/d1;


# direct methods
.method public constructor <init>(Lb7/d1;Landroid/os/Looper;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb7/a1;->e:Lb7/d1;

    .line 5
    .line 6
    new-instance p1, Lc7/h0;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lc7/h0;-><init>(Lb7/a1;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lb7/a1;->a:Lc7/h0;

    .line 12
    .line 13
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Landroidx/media3/exoplayer/offline/f;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, v1, p0}, Landroidx/media3/exoplayer/offline/f;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lb7/a1;->d:Landroid/os/Handler;

    .line 25
    .line 26
    return-void
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


# virtual methods
.method public final a(Lc7/l0;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb7/a1;->e:Lb7/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lb7/d1;->m:Lb7/c1;

    .line 4
    .line 5
    new-instance v2, Lb7/c1;

    .line 6
    .line 7
    iget-object v4, v1, Lb7/c1;->b:Lc7/p1;

    .line 8
    .line 9
    iget-object v5, v1, Lb7/c1;->c:Lc7/r0;

    .line 10
    .line 11
    iget-object v6, v1, Lb7/c1;->d:Ljava/util/List;

    .line 12
    .line 13
    iget-object v7, v1, Lb7/c1;->e:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iget v8, v1, Lb7/c1;->f:I

    .line 16
    .line 17
    iget v9, v1, Lb7/c1;->g:I

    .line 18
    .line 19
    iget-object v10, v1, Lb7/c1;->h:Landroid/os/Bundle;

    .line 20
    .line 21
    move-object v3, p1

    .line 22
    invoke-direct/range {v2 .. v10}, Lb7/c1;-><init>(Lc7/l0;Lc7/p1;Lc7/r0;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, v0, Lb7/d1;->m:Lb7/c1;

    .line 26
    .line 27
    invoke-virtual {p0}, Lb7/a1;->k()V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final b(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb7/a1;->e:Lb7/d1;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/d1;->b:Lb7/d0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, Lb7/d0;->d:Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Lb7/d0;->c:Lb7/b0;

    .line 27
    .line 28
    new-instance v2, Landroid/os/Bundle;

    .line 29
    .line 30
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED"

    .line 34
    .line 35
    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lb7/e4;

    .line 39
    .line 40
    const-string v3, "androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED"

    .line 41
    .line 42
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct {p1, v3, v4}, Lb7/e4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v0, p1, v2}, Lb7/b0;->v(Lb7/d0;Lb7/e4;Landroid/os/Bundle;)Lcb/v;

    .line 48
    .line 49
    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
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

.method public final binderDied()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, Lb7/a1;->i(ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public final c(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    move-object v8, p1

    .line 9
    iget-object p1, p0, Lb7/a1;->e:Lb7/d1;

    .line 10
    .line 11
    iget-object v0, p1, Lb7/d1;->m:Lb7/c1;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    new-instance v0, Lb7/c1;

    .line 15
    .line 16
    move-object v2, v1

    .line 17
    iget-object v1, v2, Lb7/c1;->a:Lc7/l0;

    .line 18
    .line 19
    move-object v3, v2

    .line 20
    iget-object v2, v3, Lb7/c1;->b:Lc7/p1;

    .line 21
    .line 22
    move-object v4, v3

    .line 23
    iget-object v3, v4, Lb7/c1;->c:Lc7/r0;

    .line 24
    .line 25
    move-object v5, v4

    .line 26
    iget-object v4, v5, Lb7/c1;->d:Ljava/util/List;

    .line 27
    .line 28
    move-object v6, v5

    .line 29
    iget-object v5, v6, Lb7/c1;->e:Ljava/lang/CharSequence;

    .line 30
    .line 31
    move-object v7, v6

    .line 32
    iget v6, v7, Lb7/c1;->f:I

    .line 33
    .line 34
    iget v7, v7, Lb7/c1;->g:I

    .line 35
    .line 36
    invoke-direct/range {v0 .. v8}, Lb7/c1;-><init>(Lc7/l0;Lc7/p1;Lc7/r0;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p1, Lb7/d1;->m:Lb7/c1;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p1, Lb7/d1;->n:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Lb7/a1;->k()V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public final d(Lc7/r0;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb7/a1;->e:Lb7/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lb7/d1;->m:Lb7/c1;

    .line 4
    .line 5
    new-instance v2, Lb7/c1;

    .line 6
    .line 7
    iget-object v3, v1, Lb7/c1;->a:Lc7/l0;

    .line 8
    .line 9
    iget-object v4, v1, Lb7/c1;->b:Lc7/p1;

    .line 10
    .line 11
    iget-object v6, v1, Lb7/c1;->d:Ljava/util/List;

    .line 12
    .line 13
    iget-object v7, v1, Lb7/c1;->e:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iget v8, v1, Lb7/c1;->f:I

    .line 16
    .line 17
    iget v9, v1, Lb7/c1;->g:I

    .line 18
    .line 19
    iget-object v10, v1, Lb7/c1;->h:Landroid/os/Bundle;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    invoke-direct/range {v2 .. v10}, Lb7/c1;-><init>(Lc7/l0;Lc7/p1;Lc7/r0;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, v0, Lb7/d1;->m:Lb7/c1;

    .line 26
    .line 27
    invoke-virtual {p0}, Lb7/a1;->k()V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final e(Lc7/p1;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb7/a1;->e:Lb7/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lb7/d1;->m:Lb7/c1;

    .line 4
    .line 5
    invoke-static {p1}, Lb7/d1;->d(Lc7/p1;)Lc7/p1;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    new-instance v2, Lb7/c1;

    .line 10
    .line 11
    iget-object v3, v1, Lb7/c1;->a:Lc7/l0;

    .line 12
    .line 13
    iget-object v5, v1, Lb7/c1;->c:Lc7/r0;

    .line 14
    .line 15
    iget-object v6, v1, Lb7/c1;->d:Ljava/util/List;

    .line 16
    .line 17
    iget-object v7, v1, Lb7/c1;->e:Ljava/lang/CharSequence;

    .line 18
    .line 19
    iget v8, v1, Lb7/c1;->f:I

    .line 20
    .line 21
    iget v9, v1, Lb7/c1;->g:I

    .line 22
    .line 23
    iget-object v10, v1, Lb7/c1;->h:Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct/range {v2 .. v10}, Lb7/c1;-><init>(Lc7/l0;Lc7/p1;Lc7/r0;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, v0, Lb7/d1;->m:Lb7/c1;

    .line 29
    .line 30
    invoke-virtual {p0}, Lb7/a1;->k()V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
.end method

.method public final f(Ljava/util/List;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb7/a1;->e:Lb7/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lb7/d1;->m:Lb7/c1;

    .line 4
    .line 5
    invoke-static {p1}, Lb7/d1;->b(Ljava/util/List;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    new-instance v2, Lb7/c1;

    .line 10
    .line 11
    iget-object v3, v1, Lb7/c1;->a:Lc7/l0;

    .line 12
    .line 13
    iget-object v4, v1, Lb7/c1;->b:Lc7/p1;

    .line 14
    .line 15
    iget-object v5, v1, Lb7/c1;->c:Lc7/r0;

    .line 16
    .line 17
    iget-object v7, v1, Lb7/c1;->e:Ljava/lang/CharSequence;

    .line 18
    .line 19
    iget v8, v1, Lb7/c1;->f:I

    .line 20
    .line 21
    iget v9, v1, Lb7/c1;->g:I

    .line 22
    .line 23
    iget-object v10, v1, Lb7/c1;->h:Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct/range {v2 .. v10}, Lb7/c1;-><init>(Lc7/l0;Lc7/p1;Lc7/r0;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, v0, Lb7/d1;->m:Lb7/c1;

    .line 29
    .line 30
    invoke-virtual {p0}, Lb7/a1;->k()V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
.end method

.method public final g(Ljava/lang/CharSequence;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb7/a1;->e:Lb7/d1;

    .line 2
    .line 3
    iget-object v1, v0, Lb7/d1;->m:Lb7/c1;

    .line 4
    .line 5
    new-instance v2, Lb7/c1;

    .line 6
    .line 7
    iget-object v3, v1, Lb7/c1;->a:Lc7/l0;

    .line 8
    .line 9
    iget-object v4, v1, Lb7/c1;->b:Lc7/p1;

    .line 10
    .line 11
    iget-object v5, v1, Lb7/c1;->c:Lc7/r0;

    .line 12
    .line 13
    iget-object v6, v1, Lb7/c1;->d:Ljava/util/List;

    .line 14
    .line 15
    iget v8, v1, Lb7/c1;->f:I

    .line 16
    .line 17
    iget v9, v1, Lb7/c1;->g:I

    .line 18
    .line 19
    iget-object v10, v1, Lb7/c1;->h:Landroid/os/Bundle;

    .line 20
    .line 21
    move-object v7, p1

    .line 22
    invoke-direct/range {v2 .. v10}, Lb7/c1;-><init>(Lc7/l0;Lc7/p1;Lc7/r0;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, v0, Lb7/d1;->m:Lb7/c1;

    .line 26
    .line 27
    invoke-virtual {p0}, Lb7/a1;->k()V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final h(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb7/a1;->e:Lb7/d1;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/d1;->b:Lb7/d0;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v0, Lb7/d0;->d:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v1, v2, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Lb7/d0;->c:Lb7/b0;

    .line 30
    .line 31
    new-instance v2, Lb7/e4;

    .line 32
    .line 33
    sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {v2, p1, v3}, Lb7/e4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    if-nez p2, :cond_2

    .line 39
    .line 40
    move-object p2, v3

    .line 41
    :cond_2
    invoke-interface {v1, v0, v2, p2}, Lb7/b0;->v(Lb7/d0;Lb7/e4;Landroid/os/Bundle;)Lcb/v;

    .line 42
    .line 43
    .line 44
    return-void
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

.method public final i(ILjava/lang/Object;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/a1;->b:Lb5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final j(Landroid/os/Handler;)V
    .locals 1

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lb7/a1;->b:Lb5/b;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p1, Lb5/b;->b:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lb7/a1;->b:Lb5/b;

    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    new-instance v0, Lb5/b;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p0, p1}, Lb5/b;-><init>(Lb7/a1;Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lb7/a1;->b:Lb5/b;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, v0, Lb5/b;->b:Z

    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb7/a1;->d:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-wide/16 v2, 0x1f4

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 14
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
