.class public final Lc0/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lc0/z;

.field public final b:Ljava/lang/Object;

.field public final c:Lc0/g;

.field public final d:Landroidx/media3/exoplayer/offline/u;

.field public final e:J

.field public final f:Z

.field public final g:Lb0/q0;

.field public final h:I

.field public final i:J

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:Lhf/y;

.field public final n:Z

.field public final o:Lc0/o;

.field public final p:Lq1/v;

.field public final q:La0/v;

.field public final r:Lah/j;

.field public final s:I


# direct methods
.method public constructor <init>(Lc0/z;Ljava/util/List;Lc0/g;Landroidx/media3/exoplayer/offline/u;JZLb0/q0;IJIIILhf/y;ZLc0/o;Lq1/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/k;->a:Lc0/z;

    .line 5
    .line 6
    iput-object p2, p0, Lc0/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lc0/k;->c:Lc0/g;

    .line 9
    .line 10
    iput-object p4, p0, Lc0/k;->d:Landroidx/media3/exoplayer/offline/u;

    .line 11
    .line 12
    iput-wide p5, p0, Lc0/k;->e:J

    .line 13
    .line 14
    iput-boolean p7, p0, Lc0/k;->f:Z

    .line 15
    .line 16
    iput-object p8, p0, Lc0/k;->g:Lb0/q0;

    .line 17
    .line 18
    iput p9, p0, Lc0/k;->h:I

    .line 19
    .line 20
    iput-wide p10, p0, Lc0/k;->i:J

    .line 21
    .line 22
    iput p12, p0, Lc0/k;->j:I

    .line 23
    .line 24
    iput p13, p0, Lc0/k;->k:I

    .line 25
    .line 26
    iput p14, p0, Lc0/k;->l:I

    .line 27
    .line 28
    iput-object p15, p0, Lc0/k;->m:Lhf/y;

    .line 29
    .line 30
    move/from16 p2, p16

    .line 31
    .line 32
    iput-boolean p2, p0, Lc0/k;->n:Z

    .line 33
    .line 34
    move-object/from16 p2, p17

    .line 35
    .line 36
    iput-object p2, p0, Lc0/k;->o:Lc0/o;

    .line 37
    .line 38
    move-object/from16 p2, p18

    .line 39
    .line 40
    iput-object p2, p0, Lc0/k;->p:Lq1/v;

    .line 41
    .line 42
    new-instance p2, La0/v;

    .line 43
    .line 44
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p0, p2, La0/v;->e:Ljava/lang/Object;

    .line 48
    .line 49
    iput-boolean p7, p2, La0/v;->a:Z

    .line 50
    .line 51
    iput-object p3, p2, La0/v;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object p8, p2, La0/v;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object p4, p2, La0/v;->d:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object p2, p0, Lc0/k;->q:La0/v;

    .line 58
    .line 59
    iget-object p1, p1, Lc0/z;->e:Lah/j;

    .line 60
    .line 61
    iput-object p1, p0, Lc0/k;->r:Lah/j;

    .line 62
    .line 63
    iget-object p1, p4, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, [I

    .line 66
    .line 67
    array-length p1, p1

    .line 68
    iput p1, p0, Lc0/k;->s:I

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public final b(Lc0/g;II)J
    .locals 4

    .line 1
    iget-object p1, p1, Lc0/g;->b:Lc0/f;

    .line 2
    .line 3
    iget-object p1, p1, Lc0/f;->d:Lb0/c1;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lb0/c1;->p(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget p2, p0, Lc0/k;->s:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x1

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    :cond_1
    add-int/2addr p2, p3

    .line 19
    int-to-long v0, p3

    .line 20
    const/16 p1, 0x20

    .line 21
    .line 22
    shl-long/2addr v0, p1

    .line 23
    int-to-long p1, p2

    .line 24
    const-wide v2, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr p1, v2

    .line 30
    or-long/2addr p1, v0

    .line 31
    return-wide p1
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
