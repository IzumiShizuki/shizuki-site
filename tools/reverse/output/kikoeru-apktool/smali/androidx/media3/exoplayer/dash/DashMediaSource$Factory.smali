.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lj5/c0;


# instance fields
.field public final a:Lah/j;

.field public final b:Ls4/g;

.field public final c:Lc7/e1;

.field public final d:Lg5/w;

.field public final e:Lm3/l;

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(Ls4/g;)V
    .locals 3

    .line 1
    new-instance v0, Lah/j;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lah/j;-><init>(Ls4/g;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lah/j;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Ls4/g;

    .line 12
    .line 13
    new-instance p1, Lc7/e1;

    .line 14
    .line 15
    const/4 v1, 0x6

    .line 16
    invoke-direct {p1, v1}, Lc7/e1;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Lc7/e1;

    .line 20
    .line 21
    new-instance p1, Lm3/l;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {p1, v1}, Lm3/l;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Lm3/l;

    .line 29
    .line 30
    const-wide/16 v1, 0x7530

    .line 31
    .line 32
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 33
    .line 34
    const-wide/32 v1, 0x4c4b40

    .line 35
    .line 36
    .line 37
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 38
    .line 39
    new-instance p1, Lg5/w;

    .line 40
    .line 41
    const/16 v1, 0x13

    .line 42
    .line 43
    invoke-direct {p1, v1}, Lg5/w;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lg5/w;

    .line 47
    .line 48
    iget-object p1, v0, Lah/j;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lk5/d;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p1, Lk5/d;->b:Z

    .line 54
    .line 55
    return-void
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


# virtual methods
.method public final a(Lm4/i0;)Lj5/a;
    .locals 12

    .line 1
    iget-object v0, p1, Lm4/i0;->b:Lm4/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lz4/e;

    .line 7
    .line 8
    invoke-direct {v0}, Lz4/e;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, Lm4/i0;->b:Lm4/d0;

    .line 12
    .line 13
    iget-object v2, v2, Lm4/d0;->e:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    new-instance v3, Landroidx/media3/exoplayer/offline/u;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v3, v4, v0, v2}, Landroidx/media3/exoplayer/offline/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    :goto_0
    new-instance v0, Ly4/g;

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Lc7/e1;

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Lc7/e1;->v(Lm4/i0;)Lb5/t;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-wide v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 38
    .line 39
    iget-wide v10, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 40
    .line 41
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Ls4/g;

    .line 42
    .line 43
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lah/j;

    .line 44
    .line 45
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lg5/w;

    .line 46
    .line 47
    iget-object v7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Lm3/l;

    .line 48
    .line 49
    move-object v1, p1

    .line 50
    invoke-direct/range {v0 .. v11}, Ly4/g;-><init>(Lm4/i0;Ls4/g;Ln5/q;Lah/j;Lg5/w;Lb5/t;Lm3/l;JJ)V

    .line 51
    .line 52
    .line 53
    return-object v0
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

.method public final b(Lm3/l;)Lj5/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lah/j;

    .line 2
    .line 3
    iget-object v0, v0, Lah/j;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lk5/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lk5/d;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-object p0
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

.method public final c(Z)Lj5/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lah/j;

    .line 2
    .line 3
    iget-object v0, v0, Lah/j;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lk5/d;

    .line 6
    .line 7
    iput-boolean p1, v0, Lk5/d;->b:Z

    .line 8
    .line 9
    return-object p0
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

.method public final d()Lj5/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lah/j;

    .line 2
    .line 3
    iget-object v0, v0, Lah/j;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lk5/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
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
