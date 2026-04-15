.class public final Ll6/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/n;


# static fields
.field public static final L:[B

.field public static final M:Lm4/q;


# instance fields
.field public A:J

.field public B:Ll6/i;

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:Z

.field public H:Lr5/q;

.field public I:[Lr5/h0;

.field public J:[Lr5/h0;

.field public K:Z

.field public final a:Lo6/j;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Landroid/util/SparseArray;

.field public final e:Lp4/s;

.field public final f:Lp4/s;

.field public final g:Lp4/s;

.field public final h:[B

.field public final i:Lp4/s;

.field public final j:Lp4/y;

.field public final k:Landroidx/media3/exoplayer/offline/u;

.field public final l:Lp4/s;

.field public final m:Ljava/util/ArrayDeque;

.field public final n:Ljava/util/ArrayDeque;

.field public final o:Lh7/i;

.field public final p:Lr5/h0;

.field public q:Lya/a1;

.field public r:I

.field public s:I

.field public t:J

.field public u:I

.field public v:Lp4/s;

.field public w:J

.field public x:I

.field public y:J

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll6/j;->L:[B

    .line 9
    .line 10
    new-instance v0, Lm4/p;

    .line 11
    .line 12
    invoke-direct {v0}, Lm4/p;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    invoke-static {v1}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lm4/p;->m:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v1, Lm4/q;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lm4/q;-><init>(Lm4/p;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Ll6/j;->M:Lm4/q;

    .line 29
    .line 30
    return-void

    .line 31
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
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
.end method

.method public constructor <init>(Lo6/j;I)V
    .locals 7

    .line 1
    sget-object v0, Lya/i0;->b:Lya/g0;

    .line 2
    sget-object v5, Lya/a1;->e:Lya/a1;

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    .line 3
    invoke-direct/range {v1 .. v6}, Ll6/j;-><init>(Lo6/j;ILp4/y;Ljava/util/List;Ly4/n;)V

    return-void
.end method

.method public constructor <init>(Lo6/j;ILp4/y;Ljava/util/List;Ly4/n;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Ll6/j;->a:Lo6/j;

    .line 6
    iput p2, p0, Ll6/j;->b:I

    .line 7
    iput-object p3, p0, Ll6/j;->j:Lp4/y;

    .line 8
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll6/j;->c:Ljava/util/List;

    .line 9
    iput-object p5, p0, Ll6/j;->p:Lr5/h0;

    .line 10
    new-instance p1, Landroidx/media3/exoplayer/offline/u;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/offline/u;-><init>(I)V

    iput-object p1, p0, Ll6/j;->k:Landroidx/media3/exoplayer/offline/u;

    .line 11
    new-instance p1, Lp4/s;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lp4/s;-><init>(I)V

    iput-object p1, p0, Ll6/j;->l:Lp4/s;

    .line 12
    new-instance p1, Lp4/s;

    sget-object p3, Lq4/p;->a:[B

    invoke-direct {p1, p3}, Lp4/s;-><init>([B)V

    iput-object p1, p0, Ll6/j;->e:Lp4/s;

    .line 13
    new-instance p1, Lp4/s;

    const/4 p3, 0x6

    invoke-direct {p1, p3}, Lp4/s;-><init>(I)V

    iput-object p1, p0, Ll6/j;->f:Lp4/s;

    .line 14
    new-instance p1, Lp4/s;

    invoke-direct {p1}, Lp4/s;-><init>()V

    iput-object p1, p0, Ll6/j;->g:Lp4/s;

    .line 15
    new-array p1, p2, [B

    iput-object p1, p0, Ll6/j;->h:[B

    .line 16
    new-instance p2, Lp4/s;

    invoke-direct {p2, p1}, Lp4/s;-><init>([B)V

    iput-object p2, p0, Ll6/j;->i:Lp4/s;

    .line 17
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll6/j;->m:Ljava/util/ArrayDeque;

    .line 18
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll6/j;->n:Ljava/util/ArrayDeque;

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll6/j;->d:Landroid/util/SparseArray;

    .line 20
    sget-object p1, Lya/i0;->b:Lya/g0;

    .line 21
    sget-object p1, Lya/a1;->e:Lya/a1;

    .line 22
    iput-object p1, p0, Ll6/j;->q:Lya/a1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    iput-wide p1, p0, Ll6/j;->z:J

    .line 24
    iput-wide p1, p0, Ll6/j;->y:J

    .line 25
    iput-wide p1, p0, Ll6/j;->A:J

    .line 26
    sget-object p1, Lr5/q;->n0:Lr5/p;

    iput-object p1, p0, Ll6/j;->H:Lr5/q;

    const/4 p1, 0x0

    .line 27
    new-array p2, p1, [Lr5/h0;

    iput-object p2, p0, Ll6/j;->I:[Lr5/h0;

    .line 28
    new-array p1, p1, [Lr5/h0;

    iput-object p1, p0, Ll6/j;->J:[Lr5/h0;

    .line 29
    new-instance p1, Lh7/i;

    new-instance p2, Ll6/g;

    invoke-direct {p2, p0}, Ll6/g;-><init>(Ll6/j;)V

    invoke-direct {p1, p2}, Lh7/i;-><init>(Lq4/r;)V

    iput-object p1, p0, Ll6/j;->o:Lh7/i;

    return-void
.end method

.method public static b(Ljava/util/List;)Lm4/n;
    .locals 9

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v0, :cond_4

    .line 10
    .line 11
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Lq4/c;

    .line 16
    .line 17
    iget v6, v5, Lq4/d;->b:I

    .line 18
    .line 19
    const v7, 0x70737368    # 3.013775E29f

    .line 20
    .line 21
    .line 22
    if-ne v6, v7, :cond_3

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v5, v5, Lq4/c;->c:Lp4/s;

    .line 32
    .line 33
    iget-object v5, v5, Lp4/s;->a:[B

    .line 34
    .line 35
    invoke-static {v5}, Ll6/p;->j([B)Lah/j;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v6, v6, Lah/j;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Ljava/util/UUID;

    .line 46
    .line 47
    :goto_1
    if-nez v6, :cond_2

    .line 48
    .line 49
    const-string v5, "FragmentedMp4Extractor"

    .line 50
    .line 51
    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    .line 52
    .line 53
    invoke-static {v5, v6}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    new-instance v7, Lm4/m;

    .line 58
    .line 59
    const-string v8, "video/mp4"

    .line 60
    .line 61
    invoke-direct {v7, v6, v1, v8, v5}, Lm4/m;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-nez v4, :cond_5

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_5
    new-instance p0, Lm4/n;

    .line 74
    .line 75
    new-array v0, v2, [Lm4/m;

    .line 76
    .line 77
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, [Lm4/m;

    .line 82
    .line 83
    invoke-direct {p0, v1, v2, v0}, Lm4/n;-><init>(Ljava/lang/String;Z[Lm4/m;)V

    .line 84
    .line 85
    .line 86
    return-object p0
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

.method public static d(Lp4/s;ILl6/s;)V
    .locals 5

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp4/s;->G(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lp4/s;->g()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget-object v0, Ll6/e;->a:[B

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    invoke-virtual {p0}, Lp4/s;->y()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object p0, p2, Ll6/s;->l:[Z

    .line 32
    .line 33
    iget p1, p2, Ll6/s;->e:I

    .line 34
    .line 35
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v3, p2, Ll6/s;->e:I

    .line 40
    .line 41
    iget-object v4, p2, Ll6/s;->n:Lp4/s;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v3, p2, Ll6/s;->l:[Z

    .line 46
    .line 47
    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lp4/s;->a()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v4, p1}, Lp4/s;->D(I)V

    .line 55
    .line 56
    .line 57
    iput-boolean v1, p2, Ll6/s;->k:Z

    .line 58
    .line 59
    iput-boolean v1, p2, Ll6/s;->o:Z

    .line 60
    .line 61
    iget-object p1, v4, Lp4/s;->a:[B

    .line 62
    .line 63
    iget v1, v4, Lp4/s;->c:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, v1}, Lp4/s;->e([BII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Lp4/s;->G(I)V

    .line 69
    .line 70
    .line 71
    iput-boolean v0, p2, Ll6/s;->o:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const-string p0, "Senc sample count "

    .line 75
    .line 76
    const-string p1, " is different from fragment sample count"

    .line 77
    .line 78
    invoke-static {v2, p0, p1}, Lj2/h0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget p1, p2, Ll6/s;->e:I

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-static {p1, p0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    throw p0

    .line 97
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 98
    .line 99
    invoke-static {p0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0
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


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final c()Lr5/n;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
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

.method public final e(J)V
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Ll6/j;->m:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_57

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lq4/b;

    .line 16
    .line 17
    iget-wide v4, v2, Lq4/b;->c:J

    .line 18
    .line 19
    cmp-long v2, v4, p1

    .line 20
    .line 21
    if-nez v2, :cond_57

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v4, v2

    .line 28
    check-cast v4, Lq4/b;

    .line 29
    .line 30
    iget v2, v4, Lq4/d;->b:I

    .line 31
    .line 32
    iget-object v5, v4, Lq4/b;->e:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v6, v4, Lq4/b;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    const v7, 0x6d6f6f76

    .line 37
    .line 38
    .line 39
    iget v8, v0, Ll6/j;->b:I

    .line 40
    .line 41
    const/16 v10, 0xc

    .line 42
    .line 43
    iget-object v15, v0, Ll6/j;->d:Landroid/util/SparseArray;

    .line 44
    .line 45
    if-ne v2, v7, :cond_b

    .line 46
    .line 47
    move v7, v8

    .line 48
    invoke-static {v6}, Ll6/j;->b(Ljava/util/List;)Lm4/n;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    const v1, 0x6d766578

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v1}, Lq4/b;->h(I)Lq4/b;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v2, Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v1, v1, Lq4/b;->d:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const/4 v6, 0x0

    .line 74
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    :goto_1
    if-ge v6, v5, :cond_4

    .line 80
    .line 81
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, Lq4/c;

    .line 86
    .line 87
    iget v3, v11, Lq4/d;->b:I

    .line 88
    .line 89
    iget-object v11, v11, Lq4/c;->c:Lp4/s;

    .line 90
    .line 91
    const/16 v17, 0x1

    .line 92
    .line 93
    const v12, 0x74726578

    .line 94
    .line 95
    .line 96
    if-ne v3, v12, :cond_1

    .line 97
    .line 98
    invoke-virtual {v11, v10}, Lp4/s;->G(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11}, Lp4/s;->g()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v11}, Lp4/s;->g()I

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    add-int/lit8 v12, v12, -0x1

    .line 110
    .line 111
    invoke-virtual {v11}, Lp4/s;->g()I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    invoke-virtual {v11}, Lp4/s;->g()I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    invoke-virtual {v11}, Lp4/s;->g()I

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    move-object/from16 v18, v1

    .line 128
    .line 129
    new-instance v1, Ll6/f;

    .line 130
    .line 131
    invoke-direct {v1, v12, v10, v9, v11}, Ll6/f;-><init>(IIII)V

    .line 132
    .line 133
    .line 134
    invoke-static {v3, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v3, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, Ll6/f;

    .line 149
    .line 150
    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_1
    move-object/from16 v18, v1

    .line 155
    .line 156
    const v1, 0x6d656864

    .line 157
    .line 158
    .line 159
    if-ne v3, v1, :cond_3

    .line 160
    .line 161
    const/16 v1, 0x8

    .line 162
    .line 163
    invoke-virtual {v11, v1}, Lp4/s;->G(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v11}, Lp4/s;->g()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-static {v1}, Ll6/e;->c(I)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_2

    .line 175
    .line 176
    invoke-virtual {v11}, Lp4/s;->w()J

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    goto :goto_2

    .line 181
    :cond_2
    invoke-virtual {v11}, Lp4/s;->z()J

    .line 182
    .line 183
    .line 184
    move-result-wide v9

    .line 185
    :goto_2
    move-wide v13, v9

    .line 186
    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 187
    .line 188
    move-object/from16 v1, v18

    .line 189
    .line 190
    const/16 v10, 0xc

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    const/16 v17, 0x1

    .line 194
    .line 195
    new-instance v5, Lr5/v;

    .line 196
    .line 197
    invoke-direct {v5}, Lr5/v;-><init>()V

    .line 198
    .line 199
    .line 200
    and-int/lit8 v1, v7, 0x10

    .line 201
    .line 202
    if-eqz v1, :cond_5

    .line 203
    .line 204
    const/4 v9, 0x1

    .line 205
    goto :goto_4

    .line 206
    :cond_5
    const/4 v9, 0x0

    .line 207
    :goto_4
    new-instance v11, Ll6/g;

    .line 208
    .line 209
    invoke-direct {v11, v0}, Ll6/g;-><init>(Ll6/j;)V

    .line 210
    .line 211
    .line 212
    const/4 v10, 0x0

    .line 213
    move-wide v6, v13

    .line 214
    invoke-static/range {v4 .. v11}, Ll6/e;->g(Lq4/b;Lr5/v;JLm4/n;ZZLxa/d;)Ljava/util/ArrayList;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-nez v4, :cond_8

    .line 227
    .line 228
    invoke-static {v1}, Ll6/p;->c(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    const/4 v5, 0x0

    .line 233
    :goto_5
    if-ge v5, v3, :cond_7

    .line 234
    .line 235
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    check-cast v6, Ll6/t;

    .line 240
    .line 241
    iget-object v7, v6, Ll6/t;->a:Ll6/q;

    .line 242
    .line 243
    iget-object v8, v0, Ll6/j;->H:Lr5/q;

    .line 244
    .line 245
    iget v9, v7, Ll6/q;->b:I

    .line 246
    .line 247
    iget v10, v7, Ll6/q;->a:I

    .line 248
    .line 249
    iget-wide v11, v7, Ll6/q;->e:J

    .line 250
    .line 251
    invoke-interface {v8, v5, v9}, Lr5/q;->u(II)Lr5/h0;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    new-instance v8, Ll6/i;

    .line 259
    .line 260
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    const/4 v13, 0x1

    .line 265
    if-ne v9, v13, :cond_6

    .line 266
    .line 267
    const/4 v9, 0x0

    .line 268
    invoke-virtual {v2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    check-cast v13, Ll6/f;

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_6
    invoke-virtual {v2, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    move-object v13, v9

    .line 280
    check-cast v13, Ll6/f;

    .line 281
    .line 282
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    :goto_6
    invoke-direct {v8, v7, v6, v13, v4}, Ll6/i;-><init>(Lr5/h0;Ll6/t;Ll6/f;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v15, v10, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-wide v6, v0, Ll6/j;->z:J

    .line 292
    .line 293
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 294
    .line 295
    .line 296
    move-result-wide v6

    .line 297
    iput-wide v6, v0, Ll6/j;->z:J

    .line 298
    .line 299
    add-int/lit8 v5, v5, 0x1

    .line 300
    .line 301
    const/16 v17, 0x1

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_7
    iget-object v1, v0, Ll6/j;->H:Lr5/q;

    .line 305
    .line 306
    invoke-interface {v1}, Lr5/q;->n()V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :cond_8
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-ne v4, v3, :cond_9

    .line 316
    .line 317
    const/4 v4, 0x1

    .line 318
    goto :goto_7

    .line 319
    :cond_9
    const/4 v4, 0x0

    .line 320
    :goto_7
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 321
    .line 322
    .line 323
    const/4 v4, 0x0

    .line 324
    :goto_8
    if-ge v4, v3, :cond_0

    .line 325
    .line 326
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    check-cast v5, Ll6/t;

    .line 331
    .line 332
    iget-object v6, v5, Ll6/t;->a:Ll6/q;

    .line 333
    .line 334
    iget v7, v6, Ll6/q;->a:I

    .line 335
    .line 336
    invoke-virtual {v15, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    check-cast v7, Ll6/i;

    .line 341
    .line 342
    iget v6, v6, Ll6/q;->a:I

    .line 343
    .line 344
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    const/4 v13, 0x1

    .line 349
    if-ne v8, v13, :cond_a

    .line 350
    .line 351
    const/4 v9, 0x0

    .line 352
    invoke-virtual {v2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    check-cast v6, Ll6/f;

    .line 357
    .line 358
    goto :goto_9

    .line 359
    :cond_a
    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    check-cast v6, Ll6/f;

    .line 364
    .line 365
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    :goto_9
    invoke-virtual {v7, v5, v6}, Ll6/i;->e(Ll6/t;Ll6/f;)V

    .line 369
    .line 370
    .line 371
    add-int/lit8 v4, v4, 0x1

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_b
    move v7, v8

    .line 375
    const v3, 0x6d6f6f66

    .line 376
    .line 377
    .line 378
    if-ne v2, v3, :cond_56

    .line 379
    .line 380
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    const/4 v9, 0x0

    .line 385
    :goto_a
    if-ge v9, v1, :cond_50

    .line 386
    .line 387
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    check-cast v3, Lq4/b;

    .line 392
    .line 393
    iget v4, v3, Lq4/d;->b:I

    .line 394
    .line 395
    const v8, 0x74726166

    .line 396
    .line 397
    .line 398
    if-ne v4, v8, :cond_4f

    .line 399
    .line 400
    const v4, 0x74666864

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v4}, Lq4/b;->i(I)Lq4/c;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    iget-object v8, v3, Lq4/b;->d:Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object v4, v4, Lq4/c;->c:Lp4/s;

    .line 413
    .line 414
    const/16 v10, 0x8

    .line 415
    .line 416
    invoke-virtual {v4, v10}, Lp4/s;->G(I)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    sget-object v11, Ll6/e;->a:[B

    .line 424
    .line 425
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    invoke-virtual {v15, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    check-cast v11, Ll6/i;

    .line 434
    .line 435
    if-nez v11, :cond_c

    .line 436
    .line 437
    move/from16 v21, v1

    .line 438
    .line 439
    const/4 v11, 0x0

    .line 440
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    goto :goto_10

    .line 446
    :cond_c
    iget-object v12, v11, Ll6/i;->b:Ll6/s;

    .line 447
    .line 448
    and-int/lit8 v18, v10, 0x1

    .line 449
    .line 450
    if-eqz v18, :cond_d

    .line 451
    .line 452
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    invoke-virtual {v4}, Lp4/s;->z()J

    .line 458
    .line 459
    .line 460
    move-result-wide v13

    .line 461
    iput-wide v13, v12, Ll6/s;->b:J

    .line 462
    .line 463
    iput-wide v13, v12, Ll6/s;->c:J

    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_d
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    :goto_b
    iget-object v13, v11, Ll6/i;->e:Ll6/f;

    .line 472
    .line 473
    and-int/lit8 v14, v10, 0x2

    .line 474
    .line 475
    if-eqz v14, :cond_e

    .line 476
    .line 477
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 478
    .line 479
    .line 480
    move-result v14

    .line 481
    const/16 v17, 0x1

    .line 482
    .line 483
    add-int/lit8 v14, v14, -0x1

    .line 484
    .line 485
    goto :goto_c

    .line 486
    :cond_e
    iget v14, v13, Ll6/f;->a:I

    .line 487
    .line 488
    :goto_c
    and-int/lit8 v20, v10, 0x8

    .line 489
    .line 490
    if-eqz v20, :cond_f

    .line 491
    .line 492
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 493
    .line 494
    .line 495
    move-result v20

    .line 496
    move/from16 v2, v20

    .line 497
    .line 498
    goto :goto_d

    .line 499
    :cond_f
    iget v2, v13, Ll6/f;->b:I

    .line 500
    .line 501
    :goto_d
    and-int/lit8 v21, v10, 0x10

    .line 502
    .line 503
    if-eqz v21, :cond_10

    .line 504
    .line 505
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 506
    .line 507
    .line 508
    move-result v21

    .line 509
    move/from16 v50, v21

    .line 510
    .line 511
    move/from16 v21, v1

    .line 512
    .line 513
    move/from16 v1, v50

    .line 514
    .line 515
    goto :goto_e

    .line 516
    :cond_10
    move/from16 v21, v1

    .line 517
    .line 518
    iget v1, v13, Ll6/f;->c:I

    .line 519
    .line 520
    :goto_e
    and-int/lit8 v10, v10, 0x20

    .line 521
    .line 522
    if-eqz v10, :cond_11

    .line 523
    .line 524
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    goto :goto_f

    .line 529
    :cond_11
    iget v4, v13, Ll6/f;->d:I

    .line 530
    .line 531
    :goto_f
    new-instance v10, Ll6/f;

    .line 532
    .line 533
    invoke-direct {v10, v14, v2, v1, v4}, Ll6/f;-><init>(IIII)V

    .line 534
    .line 535
    .line 536
    iput-object v10, v12, Ll6/s;->a:Ll6/f;

    .line 537
    .line 538
    :goto_10
    if-nez v11, :cond_13

    .line 539
    .line 540
    move-object/from16 v29, v5

    .line 541
    .line 542
    move-object/from16 v30, v6

    .line 543
    .line 544
    move/from16 v46, v9

    .line 545
    .line 546
    const/4 v9, 0x1

    .line 547
    const/16 v13, 0xc

    .line 548
    .line 549
    :cond_12
    const/16 v10, 0x8

    .line 550
    .line 551
    goto/16 :goto_37

    .line 552
    .line 553
    :cond_13
    iget-object v1, v11, Ll6/i;->b:Ll6/s;

    .line 554
    .line 555
    iget-wide v12, v1, Ll6/s;->p:J

    .line 556
    .line 557
    iget-boolean v2, v1, Ll6/s;->q:Z

    .line 558
    .line 559
    invoke-virtual {v11}, Ll6/i;->f()V

    .line 560
    .line 561
    .line 562
    const/4 v4, 0x1

    .line 563
    iput-boolean v4, v11, Ll6/i;->m:Z

    .line 564
    .line 565
    const v10, 0x74666474

    .line 566
    .line 567
    .line 568
    invoke-virtual {v3, v10}, Lq4/b;->i(I)Lq4/c;

    .line 569
    .line 570
    .line 571
    move-result-object v10

    .line 572
    if-eqz v10, :cond_15

    .line 573
    .line 574
    and-int/lit8 v14, v7, 0x2

    .line 575
    .line 576
    if-nez v14, :cond_15

    .line 577
    .line 578
    iget-object v2, v10, Lq4/c;->c:Lp4/s;

    .line 579
    .line 580
    const/16 v10, 0x8

    .line 581
    .line 582
    invoke-virtual {v2, v10}, Lp4/s;->G(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Lp4/s;->g()I

    .line 586
    .line 587
    .line 588
    move-result v10

    .line 589
    invoke-static {v10}, Ll6/e;->c(I)I

    .line 590
    .line 591
    .line 592
    move-result v10

    .line 593
    if-ne v10, v4, :cond_14

    .line 594
    .line 595
    invoke-virtual {v2}, Lp4/s;->z()J

    .line 596
    .line 597
    .line 598
    move-result-wide v12

    .line 599
    goto :goto_11

    .line 600
    :cond_14
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 601
    .line 602
    .line 603
    move-result-wide v12

    .line 604
    :goto_11
    iput-wide v12, v1, Ll6/s;->p:J

    .line 605
    .line 606
    iput-boolean v4, v1, Ll6/s;->q:Z

    .line 607
    .line 608
    goto :goto_12

    .line 609
    :cond_15
    iput-wide v12, v1, Ll6/s;->p:J

    .line 610
    .line 611
    iput-boolean v2, v1, Ll6/s;->q:Z

    .line 612
    .line 613
    :goto_12
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    const/4 v4, 0x0

    .line 618
    const/4 v10, 0x0

    .line 619
    const/4 v12, 0x0

    .line 620
    :goto_13
    const v13, 0x7472756e

    .line 621
    .line 622
    .line 623
    if-ge v4, v2, :cond_17

    .line 624
    .line 625
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v14

    .line 629
    check-cast v14, Lq4/c;

    .line 630
    .line 631
    move/from16 v22, v4

    .line 632
    .line 633
    iget v4, v14, Lq4/d;->b:I

    .line 634
    .line 635
    if-ne v4, v13, :cond_16

    .line 636
    .line 637
    iget-object v4, v14, Lq4/c;->c:Lp4/s;

    .line 638
    .line 639
    const/16 v13, 0xc

    .line 640
    .line 641
    invoke-virtual {v4, v13}, Lp4/s;->G(I)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v4}, Lp4/s;->y()I

    .line 645
    .line 646
    .line 647
    move-result v4

    .line 648
    if-lez v4, :cond_16

    .line 649
    .line 650
    add-int/2addr v12, v4

    .line 651
    add-int/lit8 v10, v10, 0x1

    .line 652
    .line 653
    :cond_16
    add-int/lit8 v4, v22, 0x1

    .line 654
    .line 655
    goto :goto_13

    .line 656
    :cond_17
    const/4 v4, 0x0

    .line 657
    iput v4, v11, Ll6/i;->h:I

    .line 658
    .line 659
    iput v4, v11, Ll6/i;->g:I

    .line 660
    .line 661
    iput v4, v11, Ll6/i;->f:I

    .line 662
    .line 663
    iput v10, v1, Ll6/s;->d:I

    .line 664
    .line 665
    iput v12, v1, Ll6/s;->e:I

    .line 666
    .line 667
    iget-object v4, v1, Ll6/s;->g:[I

    .line 668
    .line 669
    array-length v4, v4

    .line 670
    if-ge v4, v10, :cond_18

    .line 671
    .line 672
    new-array v4, v10, [J

    .line 673
    .line 674
    iput-object v4, v1, Ll6/s;->f:[J

    .line 675
    .line 676
    new-array v4, v10, [I

    .line 677
    .line 678
    iput-object v4, v1, Ll6/s;->g:[I

    .line 679
    .line 680
    :cond_18
    iget-object v4, v1, Ll6/s;->h:[I

    .line 681
    .line 682
    array-length v4, v4

    .line 683
    if-ge v4, v12, :cond_19

    .line 684
    .line 685
    mul-int/lit8 v12, v12, 0x7d

    .line 686
    .line 687
    div-int/lit8 v12, v12, 0x64

    .line 688
    .line 689
    new-array v4, v12, [I

    .line 690
    .line 691
    iput-object v4, v1, Ll6/s;->h:[I

    .line 692
    .line 693
    new-array v4, v12, [J

    .line 694
    .line 695
    iput-object v4, v1, Ll6/s;->i:[J

    .line 696
    .line 697
    new-array v4, v12, [Z

    .line 698
    .line 699
    iput-object v4, v1, Ll6/s;->j:[Z

    .line 700
    .line 701
    new-array v4, v12, [Z

    .line 702
    .line 703
    iput-object v4, v1, Ll6/s;->l:[Z

    .line 704
    .line 705
    :cond_19
    const/4 v4, 0x0

    .line 706
    const/4 v10, 0x0

    .line 707
    const/4 v12, 0x0

    .line 708
    :goto_14
    const-wide/16 v22, 0x0

    .line 709
    .line 710
    const/16 v24, 0x10

    .line 711
    .line 712
    if-ge v4, v2, :cond_31

    .line 713
    .line 714
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v25

    .line 718
    move-object/from16 v14, v25

    .line 719
    .line 720
    check-cast v14, Lq4/c;

    .line 721
    .line 722
    move/from16 v25, v2

    .line 723
    .line 724
    iget v2, v14, Lq4/d;->b:I

    .line 725
    .line 726
    if-ne v2, v13, :cond_30

    .line 727
    .line 728
    add-int/lit8 v2, v10, 0x1

    .line 729
    .line 730
    iget-object v14, v14, Lq4/c;->c:Lp4/s;

    .line 731
    .line 732
    const/16 v13, 0x8

    .line 733
    .line 734
    invoke-virtual {v14, v13}, Lp4/s;->G(I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v14}, Lp4/s;->g()I

    .line 738
    .line 739
    .line 740
    move-result v13

    .line 741
    sget-object v27, Ll6/e;->a:[B

    .line 742
    .line 743
    move/from16 v27, v2

    .line 744
    .line 745
    iget-object v2, v11, Ll6/i;->d:Ll6/t;

    .line 746
    .line 747
    iget-object v2, v2, Ll6/t;->a:Ll6/q;

    .line 748
    .line 749
    move/from16 v28, v4

    .line 750
    .line 751
    iget-object v4, v1, Ll6/s;->a:Ll6/f;

    .line 752
    .line 753
    sget v29, Lp4/c0;->a:I

    .line 754
    .line 755
    move-object/from16 v29, v5

    .line 756
    .line 757
    iget-object v5, v1, Ll6/s;->g:[I

    .line 758
    .line 759
    invoke-virtual {v14}, Lp4/s;->y()I

    .line 760
    .line 761
    .line 762
    move-result v30

    .line 763
    aput v30, v5, v10

    .line 764
    .line 765
    iget-object v5, v1, Ll6/s;->f:[J

    .line 766
    .line 767
    move-object/from16 v31, v5

    .line 768
    .line 769
    move-object/from16 v30, v6

    .line 770
    .line 771
    iget-wide v5, v1, Ll6/s;->b:J

    .line 772
    .line 773
    aput-wide v5, v31, v10

    .line 774
    .line 775
    and-int/lit8 v32, v13, 0x1

    .line 776
    .line 777
    if-eqz v32, :cond_1a

    .line 778
    .line 779
    move-wide/from16 v32, v5

    .line 780
    .line 781
    invoke-virtual {v14}, Lp4/s;->g()I

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    int-to-long v5, v5

    .line 786
    add-long v5, v32, v5

    .line 787
    .line 788
    aput-wide v5, v31, v10

    .line 789
    .line 790
    :cond_1a
    and-int/lit8 v5, v13, 0x4

    .line 791
    .line 792
    if-eqz v5, :cond_1b

    .line 793
    .line 794
    const/4 v5, 0x1

    .line 795
    goto :goto_15

    .line 796
    :cond_1b
    const/4 v5, 0x0

    .line 797
    :goto_15
    iget v6, v4, Ll6/f;->d:I

    .line 798
    .line 799
    if-eqz v5, :cond_1c

    .line 800
    .line 801
    invoke-virtual {v14}, Lp4/s;->g()I

    .line 802
    .line 803
    .line 804
    move-result v6

    .line 805
    :cond_1c
    move/from16 v31, v5

    .line 806
    .line 807
    and-int/lit16 v5, v13, 0x100

    .line 808
    .line 809
    if-eqz v5, :cond_1d

    .line 810
    .line 811
    const/4 v5, 0x1

    .line 812
    goto :goto_16

    .line 813
    :cond_1d
    const/4 v5, 0x0

    .line 814
    :goto_16
    move/from16 v32, v5

    .line 815
    .line 816
    and-int/lit16 v5, v13, 0x200

    .line 817
    .line 818
    if-eqz v5, :cond_1e

    .line 819
    .line 820
    const/4 v5, 0x1

    .line 821
    goto :goto_17

    .line 822
    :cond_1e
    const/4 v5, 0x0

    .line 823
    :goto_17
    move/from16 v33, v5

    .line 824
    .line 825
    and-int/lit16 v5, v13, 0x400

    .line 826
    .line 827
    if-eqz v5, :cond_1f

    .line 828
    .line 829
    const/4 v5, 0x1

    .line 830
    goto :goto_18

    .line 831
    :cond_1f
    const/4 v5, 0x0

    .line 832
    :goto_18
    and-int/lit16 v13, v13, 0x800

    .line 833
    .line 834
    if-eqz v13, :cond_20

    .line 835
    .line 836
    const/4 v13, 0x1

    .line 837
    :goto_19
    move/from16 v34, v5

    .line 838
    .line 839
    goto :goto_1a

    .line 840
    :cond_20
    const/4 v13, 0x0

    .line 841
    goto :goto_19

    .line 842
    :goto_1a
    iget-object v5, v2, Ll6/q;->i:[J

    .line 843
    .line 844
    move/from16 v35, v6

    .line 845
    .line 846
    iget-object v6, v2, Ll6/q;->j:[J

    .line 847
    .line 848
    if-eqz v5, :cond_23

    .line 849
    .line 850
    move-object/from16 v36, v6

    .line 851
    .line 852
    array-length v6, v5

    .line 853
    move-object/from16 v37, v5

    .line 854
    .line 855
    const/4 v5, 0x1

    .line 856
    if-ne v6, v5, :cond_23

    .line 857
    .line 858
    if-nez v36, :cond_21

    .line 859
    .line 860
    goto :goto_1c

    .line 861
    :cond_21
    const/16 v16, 0x0

    .line 862
    .line 863
    aget-wide v38, v37, v16

    .line 864
    .line 865
    cmp-long v5, v38, v22

    .line 866
    .line 867
    if-nez v5, :cond_22

    .line 868
    .line 869
    goto :goto_1b

    .line 870
    :cond_22
    iget-wide v5, v2, Ll6/q;->d:J

    .line 871
    .line 872
    sget-object v44, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 873
    .line 874
    const-wide/32 v40, 0xf4240

    .line 875
    .line 876
    .line 877
    move-wide/from16 v42, v5

    .line 878
    .line 879
    invoke-static/range {v38 .. v44}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 880
    .line 881
    .line 882
    move-result-wide v5

    .line 883
    aget-wide v40, v36, v16

    .line 884
    .line 885
    const-wide/32 v42, 0xf4240

    .line 886
    .line 887
    .line 888
    move-wide/from16 v37, v5

    .line 889
    .line 890
    iget-wide v5, v2, Ll6/q;->c:J

    .line 891
    .line 892
    move-object/from16 v46, v44

    .line 893
    .line 894
    move-wide/from16 v44, v5

    .line 895
    .line 896
    invoke-static/range {v40 .. v46}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 897
    .line 898
    .line 899
    move-result-wide v5

    .line 900
    add-long v5, v37, v5

    .line 901
    .line 902
    move-wide/from16 v37, v5

    .line 903
    .line 904
    iget-wide v5, v2, Ll6/q;->e:J

    .line 905
    .line 906
    cmp-long v39, v37, v5

    .line 907
    .line 908
    if-ltz v39, :cond_23

    .line 909
    .line 910
    :goto_1b
    aget-wide v22, v36, v16

    .line 911
    .line 912
    :cond_23
    :goto_1c
    iget-object v5, v1, Ll6/s;->h:[I

    .line 913
    .line 914
    iget-object v6, v1, Ll6/s;->i:[J

    .line 915
    .line 916
    move-object/from16 v36, v5

    .line 917
    .line 918
    iget-object v5, v1, Ll6/s;->j:[Z

    .line 919
    .line 920
    move-object/from16 v37, v5

    .line 921
    .line 922
    iget v5, v2, Ll6/q;->b:I

    .line 923
    .line 924
    move-object/from16 v38, v6

    .line 925
    .line 926
    const/4 v6, 0x2

    .line 927
    if-ne v5, v6, :cond_24

    .line 928
    .line 929
    and-int/lit8 v5, v7, 0x1

    .line 930
    .line 931
    if-eqz v5, :cond_24

    .line 932
    .line 933
    const/4 v5, 0x1

    .line 934
    goto :goto_1d

    .line 935
    :cond_24
    const/4 v5, 0x0

    .line 936
    :goto_1d
    iget-object v6, v1, Ll6/s;->g:[I

    .line 937
    .line 938
    aget v6, v6, v10

    .line 939
    .line 940
    add-int/2addr v6, v12

    .line 941
    move/from16 v46, v9

    .line 942
    .line 943
    iget-wide v9, v2, Ll6/q;->c:J

    .line 944
    .line 945
    move-wide/from16 v43, v9

    .line 946
    .line 947
    iget-wide v9, v1, Ll6/s;->p:J

    .line 948
    .line 949
    :goto_1e
    if-ge v12, v6, :cond_2f

    .line 950
    .line 951
    if-eqz v32, :cond_25

    .line 952
    .line 953
    invoke-virtual {v14}, Lp4/s;->g()I

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    :goto_1f
    move/from16 v26, v5

    .line 958
    .line 959
    goto :goto_20

    .line 960
    :cond_25
    iget v2, v4, Ll6/f;->b:I

    .line 961
    .line 962
    goto :goto_1f

    .line 963
    :goto_20
    const-string v5, "Unexpected negative value: "

    .line 964
    .line 965
    if-ltz v2, :cond_2e

    .line 966
    .line 967
    if-eqz v33, :cond_26

    .line 968
    .line 969
    invoke-virtual {v14}, Lp4/s;->g()I

    .line 970
    .line 971
    .line 972
    move-result v39

    .line 973
    move/from16 v47, v6

    .line 974
    .line 975
    move/from16 v6, v39

    .line 976
    .line 977
    goto :goto_21

    .line 978
    :cond_26
    move/from16 v47, v6

    .line 979
    .line 980
    iget v6, v4, Ll6/f;->c:I

    .line 981
    .line 982
    :goto_21
    if-ltz v6, :cond_2d

    .line 983
    .line 984
    if-eqz v34, :cond_27

    .line 985
    .line 986
    invoke-virtual {v14}, Lp4/s;->g()I

    .line 987
    .line 988
    .line 989
    move-result v5

    .line 990
    goto :goto_22

    .line 991
    :cond_27
    if-nez v12, :cond_28

    .line 992
    .line 993
    if-eqz v31, :cond_28

    .line 994
    .line 995
    move/from16 v5, v35

    .line 996
    .line 997
    goto :goto_22

    .line 998
    :cond_28
    iget v5, v4, Ll6/f;->d:I

    .line 999
    .line 1000
    :goto_22
    if-eqz v13, :cond_29

    .line 1001
    .line 1002
    invoke-virtual {v14}, Lp4/s;->g()I

    .line 1003
    .line 1004
    .line 1005
    move-result v39

    .line 1006
    move-object/from16 v48, v4

    .line 1007
    .line 1008
    move/from16 v4, v39

    .line 1009
    .line 1010
    :goto_23
    move/from16 v49, v5

    .line 1011
    .line 1012
    goto :goto_24

    .line 1013
    :cond_29
    move-object/from16 v48, v4

    .line 1014
    .line 1015
    const/4 v4, 0x0

    .line 1016
    goto :goto_23

    .line 1017
    :goto_24
    int-to-long v4, v4

    .line 1018
    add-long/2addr v4, v9

    .line 1019
    sub-long v39, v4, v22

    .line 1020
    .line 1021
    const-wide/32 v41, 0xf4240

    .line 1022
    .line 1023
    .line 1024
    sget-object v45, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1025
    .line 1026
    invoke-static/range {v39 .. v45}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 1027
    .line 1028
    .line 1029
    move-result-wide v4

    .line 1030
    aput-wide v4, v38, v12

    .line 1031
    .line 1032
    move-wide/from16 v39, v4

    .line 1033
    .line 1034
    iget-boolean v4, v1, Ll6/s;->q:Z

    .line 1035
    .line 1036
    if-nez v4, :cond_2a

    .line 1037
    .line 1038
    iget-object v4, v11, Ll6/i;->d:Ll6/t;

    .line 1039
    .line 1040
    iget-wide v4, v4, Ll6/t;->h:J

    .line 1041
    .line 1042
    add-long v4, v39, v4

    .line 1043
    .line 1044
    aput-wide v4, v38, v12

    .line 1045
    .line 1046
    :cond_2a
    aput v6, v36, v12

    .line 1047
    .line 1048
    shr-int/lit8 v4, v49, 0x10

    .line 1049
    .line 1050
    const/16 v17, 0x1

    .line 1051
    .line 1052
    and-int/lit8 v4, v4, 0x1

    .line 1053
    .line 1054
    if-nez v4, :cond_2c

    .line 1055
    .line 1056
    if-eqz v26, :cond_2b

    .line 1057
    .line 1058
    if-nez v12, :cond_2c

    .line 1059
    .line 1060
    :cond_2b
    const/4 v4, 0x1

    .line 1061
    goto :goto_25

    .line 1062
    :cond_2c
    const/4 v4, 0x0

    .line 1063
    :goto_25
    aput-boolean v4, v37, v12

    .line 1064
    .line 1065
    int-to-long v4, v2

    .line 1066
    add-long/2addr v9, v4

    .line 1067
    add-int/lit8 v12, v12, 0x1

    .line 1068
    .line 1069
    move/from16 v5, v26

    .line 1070
    .line 1071
    move/from16 v6, v47

    .line 1072
    .line 1073
    move-object/from16 v4, v48

    .line 1074
    .line 1075
    goto :goto_1e

    .line 1076
    :cond_2d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1077
    .line 1078
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    const/4 v3, 0x0

    .line 1089
    invoke-static {v3, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v1

    .line 1093
    throw v1

    .line 1094
    :cond_2e
    const/4 v3, 0x0

    .line 1095
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1096
    .line 1097
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v1

    .line 1107
    invoke-static {v3, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    throw v1

    .line 1112
    :cond_2f
    move/from16 v47, v6

    .line 1113
    .line 1114
    iput-wide v9, v1, Ll6/s;->p:J

    .line 1115
    .line 1116
    move/from16 v10, v27

    .line 1117
    .line 1118
    move/from16 v12, v47

    .line 1119
    .line 1120
    goto :goto_26

    .line 1121
    :cond_30
    move/from16 v28, v4

    .line 1122
    .line 1123
    move-object/from16 v29, v5

    .line 1124
    .line 1125
    move-object/from16 v30, v6

    .line 1126
    .line 1127
    move/from16 v46, v9

    .line 1128
    .line 1129
    :goto_26
    add-int/lit8 v4, v28, 0x1

    .line 1130
    .line 1131
    move/from16 v2, v25

    .line 1132
    .line 1133
    move-object/from16 v5, v29

    .line 1134
    .line 1135
    move-object/from16 v6, v30

    .line 1136
    .line 1137
    move/from16 v9, v46

    .line 1138
    .line 1139
    const v13, 0x7472756e

    .line 1140
    .line 1141
    .line 1142
    goto/16 :goto_14

    .line 1143
    .line 1144
    :cond_31
    move-object/from16 v29, v5

    .line 1145
    .line 1146
    move-object/from16 v30, v6

    .line 1147
    .line 1148
    move/from16 v46, v9

    .line 1149
    .line 1150
    iget-object v2, v11, Ll6/i;->d:Ll6/t;

    .line 1151
    .line 1152
    iget-object v2, v2, Ll6/t;->a:Ll6/q;

    .line 1153
    .line 1154
    iget-object v4, v1, Ll6/s;->a:Ll6/f;

    .line 1155
    .line 1156
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    iget v4, v4, Ll6/f;->a:I

    .line 1160
    .line 1161
    iget-object v2, v2, Ll6/q;->l:[Ll6/r;

    .line 1162
    .line 1163
    aget-object v2, v2, v4

    .line 1164
    .line 1165
    const v4, 0x7361697a

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v3, v4}, Lq4/b;->i(I)Lq4/c;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v4

    .line 1172
    if-eqz v4, :cond_38

    .line 1173
    .line 1174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    iget-object v4, v4, Lq4/c;->c:Lp4/s;

    .line 1178
    .line 1179
    iget v5, v2, Ll6/r;->d:I

    .line 1180
    .line 1181
    const/16 v10, 0x8

    .line 1182
    .line 1183
    invoke-virtual {v4, v10}, Lp4/s;->G(I)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 1187
    .line 1188
    .line 1189
    move-result v6

    .line 1190
    sget-object v9, Ll6/e;->a:[B

    .line 1191
    .line 1192
    const/4 v13, 0x1

    .line 1193
    and-int/2addr v6, v13

    .line 1194
    if-ne v6, v13, :cond_32

    .line 1195
    .line 1196
    invoke-virtual {v4, v10}, Lp4/s;->H(I)V

    .line 1197
    .line 1198
    .line 1199
    :cond_32
    invoke-virtual {v4}, Lp4/s;->u()I

    .line 1200
    .line 1201
    .line 1202
    move-result v6

    .line 1203
    invoke-virtual {v4}, Lp4/s;->y()I

    .line 1204
    .line 1205
    .line 1206
    move-result v9

    .line 1207
    iget v10, v1, Ll6/s;->e:I

    .line 1208
    .line 1209
    if-gt v9, v10, :cond_37

    .line 1210
    .line 1211
    if-nez v6, :cond_35

    .line 1212
    .line 1213
    iget-object v6, v1, Ll6/s;->l:[Z

    .line 1214
    .line 1215
    const/4 v10, 0x0

    .line 1216
    const/4 v11, 0x0

    .line 1217
    :goto_27
    if-ge v10, v9, :cond_34

    .line 1218
    .line 1219
    invoke-virtual {v4}, Lp4/s;->u()I

    .line 1220
    .line 1221
    .line 1222
    move-result v12

    .line 1223
    add-int/2addr v11, v12

    .line 1224
    if-le v12, v5, :cond_33

    .line 1225
    .line 1226
    const/4 v12, 0x1

    .line 1227
    goto :goto_28

    .line 1228
    :cond_33
    const/4 v12, 0x0

    .line 1229
    :goto_28
    aput-boolean v12, v6, v10

    .line 1230
    .line 1231
    add-int/lit8 v10, v10, 0x1

    .line 1232
    .line 1233
    goto :goto_27

    .line 1234
    :cond_34
    const/4 v6, 0x0

    .line 1235
    goto :goto_2a

    .line 1236
    :cond_35
    if-le v6, v5, :cond_36

    .line 1237
    .line 1238
    const/4 v4, 0x1

    .line 1239
    goto :goto_29

    .line 1240
    :cond_36
    const/4 v4, 0x0

    .line 1241
    :goto_29
    mul-int v11, v6, v9

    .line 1242
    .line 1243
    iget-object v5, v1, Ll6/s;->l:[Z

    .line 1244
    .line 1245
    const/4 v6, 0x0

    .line 1246
    invoke-static {v5, v6, v9, v4}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1247
    .line 1248
    .line 1249
    :goto_2a
    iget-object v4, v1, Ll6/s;->l:[Z

    .line 1250
    .line 1251
    iget v5, v1, Ll6/s;->e:I

    .line 1252
    .line 1253
    invoke-static {v4, v9, v5, v6}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1254
    .line 1255
    .line 1256
    if-lez v11, :cond_38

    .line 1257
    .line 1258
    iget-object v4, v1, Ll6/s;->n:Lp4/s;

    .line 1259
    .line 1260
    invoke-virtual {v4, v11}, Lp4/s;->D(I)V

    .line 1261
    .line 1262
    .line 1263
    const/4 v13, 0x1

    .line 1264
    iput-boolean v13, v1, Ll6/s;->k:Z

    .line 1265
    .line 1266
    iput-boolean v13, v1, Ll6/s;->o:Z

    .line 1267
    .line 1268
    goto :goto_2b

    .line 1269
    :cond_37
    const-string v2, "Saiz sample count "

    .line 1270
    .line 1271
    const-string v3, " is greater than fragment sample count"

    .line 1272
    .line 1273
    invoke-static {v9, v2, v3}, Lj2/h0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v2

    .line 1277
    iget v1, v1, Ll6/s;->e:I

    .line 1278
    .line 1279
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    const/4 v3, 0x0

    .line 1287
    invoke-static {v3, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v1

    .line 1291
    throw v1

    .line 1292
    :cond_38
    :goto_2b
    const v4, 0x7361696f

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v3, v4}, Lq4/b;->i(I)Lq4/c;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v4

    .line 1299
    if-eqz v4, :cond_3b

    .line 1300
    .line 1301
    iget-object v4, v4, Lq4/c;->c:Lp4/s;

    .line 1302
    .line 1303
    const/16 v10, 0x8

    .line 1304
    .line 1305
    invoke-virtual {v4, v10}, Lp4/s;->G(I)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 1309
    .line 1310
    .line 1311
    move-result v5

    .line 1312
    sget-object v6, Ll6/e;->a:[B

    .line 1313
    .line 1314
    and-int/lit8 v6, v5, 0x1

    .line 1315
    .line 1316
    const/4 v13, 0x1

    .line 1317
    if-ne v6, v13, :cond_39

    .line 1318
    .line 1319
    invoke-virtual {v4, v10}, Lp4/s;->H(I)V

    .line 1320
    .line 1321
    .line 1322
    :cond_39
    invoke-virtual {v4}, Lp4/s;->y()I

    .line 1323
    .line 1324
    .line 1325
    move-result v6

    .line 1326
    if-ne v6, v13, :cond_3c

    .line 1327
    .line 1328
    invoke-static {v5}, Ll6/e;->c(I)I

    .line 1329
    .line 1330
    .line 1331
    move-result v5

    .line 1332
    iget-wide v9, v1, Ll6/s;->c:J

    .line 1333
    .line 1334
    if-nez v5, :cond_3a

    .line 1335
    .line 1336
    invoke-virtual {v4}, Lp4/s;->w()J

    .line 1337
    .line 1338
    .line 1339
    move-result-wide v4

    .line 1340
    goto :goto_2c

    .line 1341
    :cond_3a
    invoke-virtual {v4}, Lp4/s;->z()J

    .line 1342
    .line 1343
    .line 1344
    move-result-wide v4

    .line 1345
    :goto_2c
    add-long/2addr v9, v4

    .line 1346
    iput-wide v9, v1, Ll6/s;->c:J

    .line 1347
    .line 1348
    :cond_3b
    const/4 v4, 0x0

    .line 1349
    goto :goto_2d

    .line 1350
    :cond_3c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1351
    .line 1352
    const-string v2, "Unexpected saio entry count: "

    .line 1353
    .line 1354
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    const/4 v4, 0x0

    .line 1365
    invoke-static {v4, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    throw v1

    .line 1370
    :goto_2d
    const v5, 0x73656e63

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v3, v5}, Lq4/b;->i(I)Lq4/c;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v3

    .line 1377
    if-eqz v3, :cond_3d

    .line 1378
    .line 1379
    iget-object v3, v3, Lq4/c;->c:Lp4/s;

    .line 1380
    .line 1381
    const/4 v9, 0x0

    .line 1382
    invoke-static {v3, v9, v1}, Ll6/j;->d(Lp4/s;ILl6/s;)V

    .line 1383
    .line 1384
    .line 1385
    :cond_3d
    if-eqz v2, :cond_3e

    .line 1386
    .line 1387
    iget-object v3, v2, Ll6/r;->b:Ljava/lang/String;

    .line 1388
    .line 1389
    move-object/from16 v33, v3

    .line 1390
    .line 1391
    goto :goto_2e

    .line 1392
    :cond_3e
    move-object/from16 v33, v4

    .line 1393
    .line 1394
    :goto_2e
    move-object v2, v4

    .line 1395
    move-object v3, v2

    .line 1396
    const/4 v5, 0x0

    .line 1397
    :goto_2f
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1398
    .line 1399
    .line 1400
    move-result v6

    .line 1401
    if-ge v5, v6, :cond_41

    .line 1402
    .line 1403
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v6

    .line 1407
    check-cast v6, Lq4/c;

    .line 1408
    .line 1409
    iget-object v9, v6, Lq4/c;->c:Lp4/s;

    .line 1410
    .line 1411
    iget v6, v6, Lq4/d;->b:I

    .line 1412
    .line 1413
    const v10, 0x73626770

    .line 1414
    .line 1415
    .line 1416
    const v11, 0x73656967

    .line 1417
    .line 1418
    .line 1419
    if-ne v6, v10, :cond_3f

    .line 1420
    .line 1421
    const/16 v13, 0xc

    .line 1422
    .line 1423
    invoke-virtual {v9, v13}, Lp4/s;->G(I)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v9}, Lp4/s;->g()I

    .line 1427
    .line 1428
    .line 1429
    move-result v6

    .line 1430
    if-ne v6, v11, :cond_40

    .line 1431
    .line 1432
    move-object v3, v9

    .line 1433
    goto :goto_30

    .line 1434
    :cond_3f
    const/16 v13, 0xc

    .line 1435
    .line 1436
    const v10, 0x73677064

    .line 1437
    .line 1438
    .line 1439
    if-ne v6, v10, :cond_40

    .line 1440
    .line 1441
    invoke-virtual {v9, v13}, Lp4/s;->G(I)V

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v9}, Lp4/s;->g()I

    .line 1445
    .line 1446
    .line 1447
    move-result v6

    .line 1448
    if-ne v6, v11, :cond_40

    .line 1449
    .line 1450
    move-object v2, v9

    .line 1451
    :cond_40
    :goto_30
    add-int/lit8 v5, v5, 0x1

    .line 1452
    .line 1453
    goto :goto_2f

    .line 1454
    :cond_41
    const/16 v13, 0xc

    .line 1455
    .line 1456
    if-eqz v3, :cond_42

    .line 1457
    .line 1458
    if-nez v2, :cond_43

    .line 1459
    .line 1460
    :cond_42
    :goto_31
    const/4 v9, 0x1

    .line 1461
    goto/16 :goto_34

    .line 1462
    .line 1463
    :cond_43
    const/16 v10, 0x8

    .line 1464
    .line 1465
    invoke-virtual {v3, v10}, Lp4/s;->G(I)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v3}, Lp4/s;->g()I

    .line 1469
    .line 1470
    .line 1471
    move-result v5

    .line 1472
    invoke-static {v5}, Ll6/e;->c(I)I

    .line 1473
    .line 1474
    .line 1475
    move-result v5

    .line 1476
    const/4 v6, 0x4

    .line 1477
    invoke-virtual {v3, v6}, Lp4/s;->H(I)V

    .line 1478
    .line 1479
    .line 1480
    const/4 v9, 0x1

    .line 1481
    if-ne v5, v9, :cond_44

    .line 1482
    .line 1483
    invoke-virtual {v3, v6}, Lp4/s;->H(I)V

    .line 1484
    .line 1485
    .line 1486
    :cond_44
    invoke-virtual {v3}, Lp4/s;->g()I

    .line 1487
    .line 1488
    .line 1489
    move-result v3

    .line 1490
    if-ne v3, v9, :cond_4c

    .line 1491
    .line 1492
    invoke-virtual {v2, v10}, Lp4/s;->G(I)V

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v2}, Lp4/s;->g()I

    .line 1496
    .line 1497
    .line 1498
    move-result v3

    .line 1499
    invoke-static {v3}, Ll6/e;->c(I)I

    .line 1500
    .line 1501
    .line 1502
    move-result v3

    .line 1503
    invoke-virtual {v2, v6}, Lp4/s;->H(I)V

    .line 1504
    .line 1505
    .line 1506
    if-ne v3, v9, :cond_46

    .line 1507
    .line 1508
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1509
    .line 1510
    .line 1511
    move-result-wide v9

    .line 1512
    cmp-long v3, v9, v22

    .line 1513
    .line 1514
    if-eqz v3, :cond_45

    .line 1515
    .line 1516
    goto :goto_32

    .line 1517
    :cond_45
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 1518
    .line 1519
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v1

    .line 1523
    throw v1

    .line 1524
    :cond_46
    const/4 v5, 0x2

    .line 1525
    if-lt v3, v5, :cond_47

    .line 1526
    .line 1527
    invoke-virtual {v2, v6}, Lp4/s;->H(I)V

    .line 1528
    .line 1529
    .line 1530
    :cond_47
    :goto_32
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1531
    .line 1532
    .line 1533
    move-result-wide v9

    .line 1534
    const-wide/16 v11, 0x1

    .line 1535
    .line 1536
    cmp-long v3, v9, v11

    .line 1537
    .line 1538
    if-nez v3, :cond_4b

    .line 1539
    .line 1540
    const/4 v5, 0x1

    .line 1541
    invoke-virtual {v2, v5}, Lp4/s;->H(I)V

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v2}, Lp4/s;->u()I

    .line 1545
    .line 1546
    .line 1547
    move-result v3

    .line 1548
    and-int/lit16 v9, v3, 0xf0

    .line 1549
    .line 1550
    shr-int/lit8 v36, v9, 0x4

    .line 1551
    .line 1552
    and-int/lit8 v37, v3, 0xf

    .line 1553
    .line 1554
    invoke-virtual {v2}, Lp4/s;->u()I

    .line 1555
    .line 1556
    .line 1557
    move-result v3

    .line 1558
    if-ne v3, v5, :cond_48

    .line 1559
    .line 1560
    const/16 v32, 0x1

    .line 1561
    .line 1562
    goto :goto_33

    .line 1563
    :cond_48
    const/16 v32, 0x0

    .line 1564
    .line 1565
    :goto_33
    if-nez v32, :cond_49

    .line 1566
    .line 1567
    goto :goto_31

    .line 1568
    :cond_49
    invoke-virtual {v2}, Lp4/s;->u()I

    .line 1569
    .line 1570
    .line 1571
    move-result v34

    .line 1572
    const/16 v3, 0x10

    .line 1573
    .line 1574
    new-array v5, v3, [B

    .line 1575
    .line 1576
    const/4 v9, 0x0

    .line 1577
    invoke-virtual {v2, v5, v9, v3}, Lp4/s;->e([BII)V

    .line 1578
    .line 1579
    .line 1580
    if-nez v34, :cond_4a

    .line 1581
    .line 1582
    invoke-virtual {v2}, Lp4/s;->u()I

    .line 1583
    .line 1584
    .line 1585
    move-result v3

    .line 1586
    new-array v4, v3, [B

    .line 1587
    .line 1588
    invoke-virtual {v2, v4, v9, v3}, Lp4/s;->e([BII)V

    .line 1589
    .line 1590
    .line 1591
    :cond_4a
    move-object/from16 v38, v4

    .line 1592
    .line 1593
    const/4 v9, 0x1

    .line 1594
    iput-boolean v9, v1, Ll6/s;->k:Z

    .line 1595
    .line 1596
    new-instance v31, Ll6/r;

    .line 1597
    .line 1598
    move-object/from16 v35, v5

    .line 1599
    .line 1600
    invoke-direct/range {v31 .. v38}, Ll6/r;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1601
    .line 1602
    .line 1603
    move-object/from16 v2, v31

    .line 1604
    .line 1605
    iput-object v2, v1, Ll6/s;->m:Ll6/r;

    .line 1606
    .line 1607
    goto :goto_34

    .line 1608
    :cond_4b
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 1609
    .line 1610
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v1

    .line 1614
    throw v1

    .line 1615
    :cond_4c
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 1616
    .line 1617
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v1

    .line 1621
    throw v1

    .line 1622
    :goto_34
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1623
    .line 1624
    .line 1625
    move-result v2

    .line 1626
    const/4 v3, 0x0

    .line 1627
    :goto_35
    if-ge v3, v2, :cond_12

    .line 1628
    .line 1629
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v4

    .line 1633
    check-cast v4, Lq4/c;

    .line 1634
    .line 1635
    iget v5, v4, Lq4/d;->b:I

    .line 1636
    .line 1637
    const v6, 0x75756964

    .line 1638
    .line 1639
    .line 1640
    if-ne v5, v6, :cond_4e

    .line 1641
    .line 1642
    iget-object v4, v4, Lq4/c;->c:Lp4/s;

    .line 1643
    .line 1644
    const/16 v10, 0x8

    .line 1645
    .line 1646
    invoke-virtual {v4, v10}, Lp4/s;->G(I)V

    .line 1647
    .line 1648
    .line 1649
    iget-object v5, v0, Ll6/j;->h:[B

    .line 1650
    .line 1651
    const/4 v6, 0x0

    .line 1652
    const/16 v11, 0x10

    .line 1653
    .line 1654
    invoke-virtual {v4, v5, v6, v11}, Lp4/s;->e([BII)V

    .line 1655
    .line 1656
    .line 1657
    sget-object v6, Ll6/j;->L:[B

    .line 1658
    .line 1659
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1660
    .line 1661
    .line 1662
    move-result v5

    .line 1663
    if-nez v5, :cond_4d

    .line 1664
    .line 1665
    goto :goto_36

    .line 1666
    :cond_4d
    invoke-static {v4, v11, v1}, Ll6/j;->d(Lp4/s;ILl6/s;)V

    .line 1667
    .line 1668
    .line 1669
    goto :goto_36

    .line 1670
    :cond_4e
    const/16 v10, 0x8

    .line 1671
    .line 1672
    const/16 v11, 0x10

    .line 1673
    .line 1674
    :goto_36
    add-int/lit8 v3, v3, 0x1

    .line 1675
    .line 1676
    goto :goto_35

    .line 1677
    :cond_4f
    move/from16 v21, v1

    .line 1678
    .line 1679
    move-object/from16 v29, v5

    .line 1680
    .line 1681
    move-object/from16 v30, v6

    .line 1682
    .line 1683
    move/from16 v46, v9

    .line 1684
    .line 1685
    const/4 v9, 0x1

    .line 1686
    const/16 v10, 0x8

    .line 1687
    .line 1688
    const/16 v13, 0xc

    .line 1689
    .line 1690
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    :goto_37
    add-int/lit8 v1, v46, 0x1

    .line 1696
    .line 1697
    move v9, v1

    .line 1698
    move/from16 v1, v21

    .line 1699
    .line 1700
    move-object/from16 v5, v29

    .line 1701
    .line 1702
    move-object/from16 v6, v30

    .line 1703
    .line 1704
    goto/16 :goto_a

    .line 1705
    .line 1706
    :cond_50
    move-object/from16 v30, v6

    .line 1707
    .line 1708
    const/4 v4, 0x0

    .line 1709
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    invoke-static/range {v30 .. v30}, Ll6/j;->b(Ljava/util/List;)Lm4/n;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v1

    .line 1718
    if-eqz v1, :cond_52

    .line 1719
    .line 1720
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 1721
    .line 1722
    .line 1723
    move-result v2

    .line 1724
    const/4 v9, 0x0

    .line 1725
    :goto_38
    if-ge v9, v2, :cond_52

    .line 1726
    .line 1727
    invoke-virtual {v15, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v3

    .line 1731
    check-cast v3, Ll6/i;

    .line 1732
    .line 1733
    iget-object v5, v3, Ll6/i;->d:Ll6/t;

    .line 1734
    .line 1735
    iget-object v5, v5, Ll6/t;->a:Ll6/q;

    .line 1736
    .line 1737
    iget-object v6, v3, Ll6/i;->b:Ll6/s;

    .line 1738
    .line 1739
    iget-object v6, v6, Ll6/s;->a:Ll6/f;

    .line 1740
    .line 1741
    sget v7, Lp4/c0;->a:I

    .line 1742
    .line 1743
    iget v6, v6, Ll6/f;->a:I

    .line 1744
    .line 1745
    iget-object v5, v5, Ll6/q;->l:[Ll6/r;

    .line 1746
    .line 1747
    aget-object v5, v5, v6

    .line 1748
    .line 1749
    if-eqz v5, :cond_51

    .line 1750
    .line 1751
    iget-object v5, v5, Ll6/r;->b:Ljava/lang/String;

    .line 1752
    .line 1753
    goto :goto_39

    .line 1754
    :cond_51
    move-object v5, v4

    .line 1755
    :goto_39
    invoke-virtual {v1, v5}, Lm4/n;->a(Ljava/lang/String;)Lm4/n;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v5

    .line 1759
    iget-object v6, v3, Ll6/i;->d:Ll6/t;

    .line 1760
    .line 1761
    iget-object v6, v6, Ll6/t;->a:Ll6/q;

    .line 1762
    .line 1763
    iget-object v6, v6, Ll6/q;->g:Lm4/q;

    .line 1764
    .line 1765
    invoke-virtual {v6}, Lm4/q;->a()Lm4/p;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v6

    .line 1769
    iget-object v7, v3, Ll6/i;->j:Ljava/lang/String;

    .line 1770
    .line 1771
    invoke-static {v7}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v7

    .line 1775
    iput-object v7, v6, Lm4/p;->l:Ljava/lang/String;

    .line 1776
    .line 1777
    iput-object v5, v6, Lm4/p;->q:Lm4/n;

    .line 1778
    .line 1779
    new-instance v5, Lm4/q;

    .line 1780
    .line 1781
    invoke-direct {v5, v6}, Lm4/q;-><init>(Lm4/p;)V

    .line 1782
    .line 1783
    .line 1784
    iget-object v3, v3, Ll6/i;->a:Lr5/h0;

    .line 1785
    .line 1786
    invoke-interface {v3, v5}, Lr5/h0;->b(Lm4/q;)V

    .line 1787
    .line 1788
    .line 1789
    add-int/lit8 v9, v9, 0x1

    .line 1790
    .line 1791
    goto :goto_38

    .line 1792
    :cond_52
    iget-wide v1, v0, Ll6/j;->y:J

    .line 1793
    .line 1794
    cmp-long v3, v1, v18

    .line 1795
    .line 1796
    if-eqz v3, :cond_0

    .line 1797
    .line 1798
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 1799
    .line 1800
    .line 1801
    move-result v1

    .line 1802
    const/4 v3, 0x0

    .line 1803
    :goto_3a
    if-ge v3, v1, :cond_55

    .line 1804
    .line 1805
    invoke-virtual {v15, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v2

    .line 1809
    check-cast v2, Ll6/i;

    .line 1810
    .line 1811
    iget-wide v4, v0, Ll6/j;->y:J

    .line 1812
    .line 1813
    iget v6, v2, Ll6/i;->f:I

    .line 1814
    .line 1815
    :goto_3b
    iget-object v7, v2, Ll6/i;->b:Ll6/s;

    .line 1816
    .line 1817
    iget v8, v7, Ll6/s;->e:I

    .line 1818
    .line 1819
    if-ge v6, v8, :cond_54

    .line 1820
    .line 1821
    iget-object v8, v7, Ll6/s;->i:[J

    .line 1822
    .line 1823
    aget-wide v9, v8, v6

    .line 1824
    .line 1825
    cmp-long v8, v9, v4

    .line 1826
    .line 1827
    if-gtz v8, :cond_54

    .line 1828
    .line 1829
    iget-object v7, v7, Ll6/s;->j:[Z

    .line 1830
    .line 1831
    aget-boolean v7, v7, v6

    .line 1832
    .line 1833
    if-eqz v7, :cond_53

    .line 1834
    .line 1835
    iput v6, v2, Ll6/i;->i:I

    .line 1836
    .line 1837
    :cond_53
    add-int/lit8 v6, v6, 0x1

    .line 1838
    .line 1839
    goto :goto_3b

    .line 1840
    :cond_54
    add-int/lit8 v3, v3, 0x1

    .line 1841
    .line 1842
    goto :goto_3a

    .line 1843
    :cond_55
    move-wide/from16 v2, v18

    .line 1844
    .line 1845
    iput-wide v2, v0, Ll6/j;->y:J

    .line 1846
    .line 1847
    goto/16 :goto_0

    .line 1848
    .line 1849
    :cond_56
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1850
    .line 1851
    .line 1852
    move-result v2

    .line 1853
    if-nez v2, :cond_0

    .line 1854
    .line 1855
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v1

    .line 1859
    check-cast v1, Lq4/b;

    .line 1860
    .line 1861
    iget-object v1, v1, Lq4/b;->e:Ljava/util/ArrayList;

    .line 1862
    .line 1863
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1864
    .line 1865
    .line 1866
    goto/16 :goto_0

    .line 1867
    .line 1868
    :cond_57
    const/4 v9, 0x0

    .line 1869
    iput v9, v0, Ll6/j;->r:I

    .line 1870
    .line 1871
    iput v9, v0, Ll6/j;->u:I

    .line 1872
    .line 1873
    return-void
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
.end method

.method public final f(Lr5/o;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, Ll6/p;->m(Lr5/o;ZZ)Lr5/f0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v2, Lya/i0;->b:Lya/g0;

    .line 15
    .line 16
    sget-object v2, Lya/a1;->e:Lya/a1;

    .line 17
    .line 18
    :goto_0
    iput-object v2, p0, Ll6/j;->q:Lya/a1;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    return v1
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

.method public final g(Lr5/o;Lb0/a;)I
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_0
    iget v2, v0, Ll6/j;->r:I

    .line 6
    .line 7
    iget-object v5, v0, Ll6/j;->m:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iget-object v7, v0, Ll6/j;->o:Lh7/i;

    .line 10
    .line 11
    iget-object v8, v0, Ll6/j;->d:Landroid/util/SparseArray;

    .line 12
    .line 13
    const/4 v11, 0x2

    .line 14
    const/4 v12, 0x1

    .line 15
    const/4 v13, 0x0

    .line 16
    if-eqz v2, :cond_46

    .line 17
    .line 18
    iget-object v14, v0, Ll6/j;->n:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    const-string v15, "FragmentedMp4Extractor"

    .line 21
    .line 22
    iget-object v4, v0, Ll6/j;->j:Lp4/y;

    .line 23
    .line 24
    if-eq v2, v12, :cond_35

    .line 25
    .line 26
    const-wide v16, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-eq v2, v11, :cond_30

    .line 32
    .line 33
    iget-object v2, v0, Ll6/j;->B:Ll6/i;

    .line 34
    .line 35
    if-nez v2, :cond_9

    .line 36
    .line 37
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/16 v18, 0x2

    .line 44
    .line 45
    :goto_1
    if-ge v6, v2, :cond_4

    .line 46
    .line 47
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v20

    .line 51
    move-object/from16 v3, v20

    .line 52
    .line 53
    check-cast v3, Ll6/i;

    .line 54
    .line 55
    const/16 v20, 0x8

    .line 56
    .line 57
    iget-boolean v9, v3, Ll6/i;->m:Z

    .line 58
    .line 59
    const/16 v22, 0x1

    .line 60
    .line 61
    iget-object v12, v3, Ll6/i;->b:Ll6/s;

    .line 62
    .line 63
    if-nez v9, :cond_0

    .line 64
    .line 65
    iget v5, v3, Ll6/i;->f:I

    .line 66
    .line 67
    iget-object v10, v3, Ll6/i;->d:Ll6/t;

    .line 68
    .line 69
    iget v10, v10, Ll6/t;->b:I

    .line 70
    .line 71
    if-eq v5, v10, :cond_3

    .line 72
    .line 73
    :cond_0
    if-eqz v9, :cond_1

    .line 74
    .line 75
    iget v5, v3, Ll6/i;->h:I

    .line 76
    .line 77
    iget v10, v12, Ll6/s;->d:I

    .line 78
    .line 79
    if-ne v5, v10, :cond_1

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_1
    if-nez v9, :cond_2

    .line 83
    .line 84
    iget-object v5, v3, Ll6/i;->d:Ll6/t;

    .line 85
    .line 86
    iget-object v5, v5, Ll6/t;->c:[J

    .line 87
    .line 88
    iget v9, v3, Ll6/i;->f:I

    .line 89
    .line 90
    aget-wide v9, v5, v9

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    iget-object v5, v12, Ll6/s;->f:[J

    .line 94
    .line 95
    iget v9, v3, Ll6/i;->h:I

    .line 96
    .line 97
    aget-wide v9, v5, v9

    .line 98
    .line 99
    :goto_2
    cmp-long v5, v9, v16

    .line 100
    .line 101
    if-gez v5, :cond_3

    .line 102
    .line 103
    move-object v11, v3

    .line 104
    move-wide/from16 v16, v9

    .line 105
    .line 106
    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    const/4 v12, 0x1

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    const/16 v20, 0x8

    .line 111
    .line 112
    const/16 v22, 0x1

    .line 113
    .line 114
    if-nez v11, :cond_6

    .line 115
    .line 116
    iget-wide v2, v0, Ll6/j;->w:J

    .line 117
    .line 118
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    sub-long/2addr v2, v4

    .line 123
    long-to-int v3, v2

    .line 124
    if-ltz v3, :cond_5

    .line 125
    .line 126
    invoke-interface {v1, v3}, Lr5/o;->r(I)V

    .line 127
    .line 128
    .line 129
    iput v13, v0, Ll6/j;->r:I

    .line 130
    .line 131
    iput v13, v0, Ll6/j;->u:I

    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_5
    const-string v1, "Offset to end of mdat was negative."

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-static {v2, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    throw v1

    .line 143
    :cond_6
    iget-boolean v2, v11, Ll6/i;->m:Z

    .line 144
    .line 145
    if-nez v2, :cond_7

    .line 146
    .line 147
    iget-object v2, v11, Ll6/i;->d:Ll6/t;

    .line 148
    .line 149
    iget-object v2, v2, Ll6/t;->c:[J

    .line 150
    .line 151
    iget v3, v11, Ll6/i;->f:I

    .line 152
    .line 153
    aget-wide v5, v2, v3

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_7
    iget-object v2, v11, Ll6/i;->b:Ll6/s;

    .line 157
    .line 158
    iget-object v2, v2, Ll6/s;->f:[J

    .line 159
    .line 160
    iget v3, v11, Ll6/i;->h:I

    .line 161
    .line 162
    aget-wide v5, v2, v3

    .line 163
    .line 164
    :goto_4
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 165
    .line 166
    .line 167
    move-result-wide v2

    .line 168
    sub-long/2addr v5, v2

    .line 169
    long-to-int v2, v5

    .line 170
    if-gez v2, :cond_8

    .line 171
    .line 172
    const-string v2, "Ignoring negative offset to sample data."

    .line 173
    .line 174
    invoke-static {v15, v2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const/4 v2, 0x0

    .line 178
    :cond_8
    invoke-interface {v1, v2}, Lr5/o;->r(I)V

    .line 179
    .line 180
    .line 181
    iput-object v11, v0, Ll6/j;->B:Ll6/i;

    .line 182
    .line 183
    move-object v2, v11

    .line 184
    goto :goto_5

    .line 185
    :cond_9
    const/16 v18, 0x2

    .line 186
    .line 187
    const/16 v20, 0x8

    .line 188
    .line 189
    const/16 v22, 0x1

    .line 190
    .line 191
    :goto_5
    iget-object v3, v2, Ll6/i;->a:Lr5/h0;

    .line 192
    .line 193
    iget-object v5, v2, Ll6/i;->b:Ll6/s;

    .line 194
    .line 195
    iget v6, v0, Ll6/j;->r:I

    .line 196
    .line 197
    const/4 v8, 0x6

    .line 198
    const-string v9, "video/hevc"

    .line 199
    .line 200
    const-string v10, "video/avc"

    .line 201
    .line 202
    const/4 v11, 0x3

    .line 203
    if-ne v6, v11, :cond_14

    .line 204
    .line 205
    iget-boolean v6, v2, Ll6/i;->m:Z

    .line 206
    .line 207
    if-nez v6, :cond_a

    .line 208
    .line 209
    iget-object v6, v2, Ll6/i;->d:Ll6/t;

    .line 210
    .line 211
    iget-object v6, v6, Ll6/t;->d:[I

    .line 212
    .line 213
    iget v11, v2, Ll6/i;->f:I

    .line 214
    .line 215
    aget v6, v6, v11

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_a
    iget-object v6, v5, Ll6/s;->h:[I

    .line 219
    .line 220
    iget v11, v2, Ll6/i;->f:I

    .line 221
    .line 222
    aget v6, v6, v11

    .line 223
    .line 224
    :goto_6
    iput v6, v0, Ll6/j;->C:I

    .line 225
    .line 226
    iget-object v6, v2, Ll6/i;->d:Ll6/t;

    .line 227
    .line 228
    iget-object v6, v6, Ll6/t;->a:Ll6/q;

    .line 229
    .line 230
    iget-object v6, v6, Ll6/q;->g:Lm4/q;

    .line 231
    .line 232
    iget-object v11, v6, Lm4/q;->n:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v11, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    iget v12, v0, Ll6/j;->b:I

    .line 239
    .line 240
    if-eqz v11, :cond_c

    .line 241
    .line 242
    and-int/lit8 v6, v12, 0x40

    .line 243
    .line 244
    if-eqz v6, :cond_b

    .line 245
    .line 246
    :goto_7
    const/4 v6, 0x1

    .line 247
    goto :goto_8

    .line 248
    :cond_b
    const/4 v6, 0x0

    .line 249
    goto :goto_8

    .line 250
    :cond_c
    iget-object v6, v6, Lm4/q;->n:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {v6, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    if-eqz v6, :cond_b

    .line 257
    .line 258
    and-int/lit16 v6, v12, 0x80

    .line 259
    .line 260
    if-eqz v6, :cond_b

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :goto_8
    xor-int/lit8 v6, v6, 0x1

    .line 264
    .line 265
    iput-boolean v6, v0, Ll6/j;->F:Z

    .line 266
    .line 267
    iget v6, v2, Ll6/i;->f:I

    .line 268
    .line 269
    iget v11, v2, Ll6/i;->i:I

    .line 270
    .line 271
    if-ge v6, v11, :cond_11

    .line 272
    .line 273
    iget v3, v0, Ll6/j;->C:I

    .line 274
    .line 275
    invoke-interface {v1, v3}, Lr5/o;->r(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Ll6/i;->b()Ll6/r;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    if-nez v1, :cond_d

    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_d
    iget-object v3, v5, Ll6/s;->n:Lp4/s;

    .line 286
    .line 287
    iget v1, v1, Ll6/r;->d:I

    .line 288
    .line 289
    if-eqz v1, :cond_e

    .line 290
    .line 291
    invoke-virtual {v3, v1}, Lp4/s;->H(I)V

    .line 292
    .line 293
    .line 294
    :cond_e
    iget v1, v2, Ll6/i;->f:I

    .line 295
    .line 296
    iget-boolean v4, v5, Ll6/s;->k:Z

    .line 297
    .line 298
    if-eqz v4, :cond_f

    .line 299
    .line 300
    iget-object v4, v5, Ll6/s;->l:[Z

    .line 301
    .line 302
    aget-boolean v1, v4, v1

    .line 303
    .line 304
    if-eqz v1, :cond_f

    .line 305
    .line 306
    invoke-virtual {v3}, Lp4/s;->A()I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    mul-int/lit8 v1, v1, 0x6

    .line 311
    .line 312
    invoke-virtual {v3, v1}, Lp4/s;->H(I)V

    .line 313
    .line 314
    .line 315
    :cond_f
    :goto_9
    invoke-virtual {v2}, Ll6/i;->c()Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-nez v1, :cond_10

    .line 320
    .line 321
    const/4 v2, 0x0

    .line 322
    iput-object v2, v0, Ll6/j;->B:Ll6/i;

    .line 323
    .line 324
    :cond_10
    const/4 v11, 0x3

    .line 325
    iput v11, v0, Ll6/j;->r:I

    .line 326
    .line 327
    return v13

    .line 328
    :cond_11
    iget-object v6, v2, Ll6/i;->d:Ll6/t;

    .line 329
    .line 330
    iget-object v6, v6, Ll6/t;->a:Ll6/q;

    .line 331
    .line 332
    iget v6, v6, Ll6/q;->h:I

    .line 333
    .line 334
    const/4 v11, 0x1

    .line 335
    if-ne v6, v11, :cond_12

    .line 336
    .line 337
    iget v6, v0, Ll6/j;->C:I

    .line 338
    .line 339
    add-int/lit8 v6, v6, -0x8

    .line 340
    .line 341
    iput v6, v0, Ll6/j;->C:I

    .line 342
    .line 343
    const/16 v6, 0x8

    .line 344
    .line 345
    invoke-interface {v1, v6}, Lr5/o;->r(I)V

    .line 346
    .line 347
    .line 348
    :cond_12
    iget-object v6, v2, Ll6/i;->d:Ll6/t;

    .line 349
    .line 350
    iget-object v6, v6, Ll6/t;->a:Ll6/q;

    .line 351
    .line 352
    iget-object v6, v6, Ll6/q;->g:Lm4/q;

    .line 353
    .line 354
    iget-object v6, v6, Lm4/q;->n:Ljava/lang/String;

    .line 355
    .line 356
    const-string v11, "audio/ac4"

    .line 357
    .line 358
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    if-eqz v6, :cond_13

    .line 363
    .line 364
    iget v6, v0, Ll6/j;->C:I

    .line 365
    .line 366
    const/4 v11, 0x7

    .line 367
    invoke-virtual {v2, v6, v11}, Ll6/i;->d(II)I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    iput v6, v0, Ll6/j;->D:I

    .line 372
    .line 373
    iget v6, v0, Ll6/j;->C:I

    .line 374
    .line 375
    iget-object v12, v0, Ll6/j;->i:Lp4/s;

    .line 376
    .line 377
    invoke-static {v6, v12}, Lr5/b;->g(ILp4/s;)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v3, v11, v12}, Lr5/h0;->e(ILp4/s;)V

    .line 381
    .line 382
    .line 383
    iget v6, v0, Ll6/j;->D:I

    .line 384
    .line 385
    add-int/2addr v6, v11

    .line 386
    iput v6, v0, Ll6/j;->D:I

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_13
    iget v6, v0, Ll6/j;->C:I

    .line 390
    .line 391
    invoke-virtual {v2, v6, v13}, Ll6/i;->d(II)I

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    iput v6, v0, Ll6/j;->D:I

    .line 396
    .line 397
    :goto_a
    iget v6, v0, Ll6/j;->C:I

    .line 398
    .line 399
    iget v11, v0, Ll6/j;->D:I

    .line 400
    .line 401
    add-int/2addr v6, v11

    .line 402
    iput v6, v0, Ll6/j;->C:I

    .line 403
    .line 404
    const/4 v6, 0x4

    .line 405
    iput v6, v0, Ll6/j;->r:I

    .line 406
    .line 407
    iput v13, v0, Ll6/j;->E:I

    .line 408
    .line 409
    :cond_14
    iget-object v6, v2, Ll6/i;->d:Ll6/t;

    .line 410
    .line 411
    iget-object v11, v6, Ll6/t;->a:Ll6/q;

    .line 412
    .line 413
    iget-boolean v12, v2, Ll6/i;->m:Z

    .line 414
    .line 415
    if-nez v12, :cond_15

    .line 416
    .line 417
    iget-object v5, v6, Ll6/t;->f:[J

    .line 418
    .line 419
    iget v6, v2, Ll6/i;->f:I

    .line 420
    .line 421
    aget-wide v15, v5, v6

    .line 422
    .line 423
    :goto_b
    move-wide v5, v15

    .line 424
    goto :goto_c

    .line 425
    :cond_15
    iget v6, v2, Ll6/i;->f:I

    .line 426
    .line 427
    iget-object v5, v5, Ll6/s;->i:[J

    .line 428
    .line 429
    aget-wide v15, v5, v6

    .line 430
    .line 431
    goto :goto_b

    .line 432
    :goto_c
    if-eqz v4, :cond_16

    .line 433
    .line 434
    invoke-virtual {v4, v5, v6}, Lp4/y;->a(J)J

    .line 435
    .line 436
    .line 437
    move-result-wide v5

    .line 438
    :cond_16
    iget v12, v11, Ll6/q;->k:I

    .line 439
    .line 440
    iget-object v11, v11, Ll6/q;->g:Lm4/q;

    .line 441
    .line 442
    if-eqz v12, :cond_27

    .line 443
    .line 444
    iget-object v15, v0, Ll6/j;->f:Lp4/s;

    .line 445
    .line 446
    iget-object v8, v15, Lp4/s;->a:[B

    .line 447
    .line 448
    aput-byte v13, v8, v13

    .line 449
    .line 450
    const/16 v22, 0x1

    .line 451
    .line 452
    aput-byte v13, v8, v22

    .line 453
    .line 454
    aput-byte v13, v8, v18

    .line 455
    .line 456
    rsub-int/lit8 v13, v12, 0x4

    .line 457
    .line 458
    move-object/from16 v17, v2

    .line 459
    .line 460
    :goto_d
    iget v2, v0, Ll6/j;->D:I

    .line 461
    .line 462
    move/from16 v20, v12

    .line 463
    .line 464
    iget v12, v0, Ll6/j;->C:I

    .line 465
    .line 466
    if-ge v2, v12, :cond_28

    .line 467
    .line 468
    iget v2, v0, Ll6/j;->E:I

    .line 469
    .line 470
    if-nez v2, :cond_21

    .line 471
    .line 472
    iget-object v2, v0, Ll6/j;->J:[Lr5/h0;

    .line 473
    .line 474
    array-length v2, v2

    .line 475
    if-gtz v2, :cond_17

    .line 476
    .line 477
    iget-boolean v2, v0, Ll6/j;->F:Z

    .line 478
    .line 479
    if-nez v2, :cond_18

    .line 480
    .line 481
    :cond_17
    invoke-static {v11}, Lq4/p;->d(Lm4/q;)I

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    add-int v12, v20, v2

    .line 486
    .line 487
    move/from16 v18, v2

    .line 488
    .line 489
    iget v2, v0, Ll6/j;->C:I

    .line 490
    .line 491
    move/from16 v24, v2

    .line 492
    .line 493
    iget v2, v0, Ll6/j;->D:I

    .line 494
    .line 495
    sub-int v2, v24, v2

    .line 496
    .line 497
    if-gt v12, v2, :cond_18

    .line 498
    .line 499
    move/from16 v2, v18

    .line 500
    .line 501
    goto :goto_e

    .line 502
    :cond_18
    const/4 v2, 0x0

    .line 503
    :goto_e
    add-int v12, v20, v2

    .line 504
    .line 505
    invoke-interface {v1, v8, v13, v12}, Lr5/o;->readFully([BII)V

    .line 506
    .line 507
    .line 508
    const/4 v12, 0x0

    .line 509
    invoke-virtual {v15, v12}, Lp4/s;->G(I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v15}, Lp4/s;->g()I

    .line 513
    .line 514
    .line 515
    move-result v18

    .line 516
    if-ltz v18, :cond_20

    .line 517
    .line 518
    sub-int v12, v18, v2

    .line 519
    .line 520
    iput v12, v0, Ll6/j;->E:I

    .line 521
    .line 522
    iget-object v12, v0, Ll6/j;->e:Lp4/s;

    .line 523
    .line 524
    move/from16 v18, v13

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    invoke-virtual {v12, v13}, Lp4/s;->G(I)V

    .line 528
    .line 529
    .line 530
    const/4 v13, 0x4

    .line 531
    invoke-interface {v3, v13, v12}, Lr5/h0;->e(ILp4/s;)V

    .line 532
    .line 533
    .line 534
    iget v12, v0, Ll6/j;->D:I

    .line 535
    .line 536
    add-int/2addr v12, v13

    .line 537
    iput v12, v0, Ll6/j;->D:I

    .line 538
    .line 539
    iget v12, v0, Ll6/j;->C:I

    .line 540
    .line 541
    add-int v12, v12, v18

    .line 542
    .line 543
    iput v12, v0, Ll6/j;->C:I

    .line 544
    .line 545
    iget-object v12, v0, Ll6/j;->J:[Lr5/h0;

    .line 546
    .line 547
    array-length v12, v12

    .line 548
    if-lez v12, :cond_1d

    .line 549
    .line 550
    if-lez v2, :cond_1d

    .line 551
    .line 552
    aget-byte v12, v8, v13

    .line 553
    .line 554
    iget-object v13, v11, Lm4/q;->n:Ljava/lang/String;

    .line 555
    .line 556
    move/from16 v24, v12

    .line 557
    .line 558
    iget-object v12, v11, Lm4/q;->k:Ljava/lang/String;

    .line 559
    .line 560
    invoke-static {v13, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v13

    .line 564
    if-nez v13, :cond_1a

    .line 565
    .line 566
    invoke-static {v12, v10}, Lm4/o0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v13

    .line 570
    if-eqz v13, :cond_19

    .line 571
    .line 572
    goto :goto_f

    .line 573
    :cond_19
    move-object/from16 v25, v10

    .line 574
    .line 575
    const/4 v10, 0x6

    .line 576
    goto :goto_10

    .line 577
    :cond_1a
    :goto_f
    and-int/lit8 v13, v24, 0x1f

    .line 578
    .line 579
    move-object/from16 v25, v10

    .line 580
    .line 581
    const/4 v10, 0x6

    .line 582
    if-eq v13, v10, :cond_1c

    .line 583
    .line 584
    :goto_10
    iget-object v13, v11, Lm4/q;->n:Ljava/lang/String;

    .line 585
    .line 586
    invoke-static {v13, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v13

    .line 590
    if-nez v13, :cond_1b

    .line 591
    .line 592
    invoke-static {v12, v9}, Lm4/o0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v12

    .line 596
    if-eqz v12, :cond_1e

    .line 597
    .line 598
    :cond_1b
    and-int/lit8 v12, v24, 0x7e

    .line 599
    .line 600
    const/16 v22, 0x1

    .line 601
    .line 602
    shr-int/lit8 v12, v12, 0x1

    .line 603
    .line 604
    const/16 v13, 0x27

    .line 605
    .line 606
    if-ne v12, v13, :cond_1e

    .line 607
    .line 608
    :cond_1c
    const/4 v12, 0x1

    .line 609
    goto :goto_11

    .line 610
    :cond_1d
    move-object/from16 v25, v10

    .line 611
    .line 612
    const/4 v10, 0x6

    .line 613
    :cond_1e
    const/4 v12, 0x0

    .line 614
    :goto_11
    iput-boolean v12, v0, Ll6/j;->G:Z

    .line 615
    .line 616
    invoke-interface {v3, v2, v15}, Lr5/h0;->e(ILp4/s;)V

    .line 617
    .line 618
    .line 619
    iget v12, v0, Ll6/j;->D:I

    .line 620
    .line 621
    add-int/2addr v12, v2

    .line 622
    iput v12, v0, Ll6/j;->D:I

    .line 623
    .line 624
    if-lez v2, :cond_1f

    .line 625
    .line 626
    iget-boolean v12, v0, Ll6/j;->F:Z

    .line 627
    .line 628
    if-nez v12, :cond_1f

    .line 629
    .line 630
    invoke-static {v8, v2, v11}, Lq4/p;->c([BILm4/q;)Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    if-eqz v2, :cond_1f

    .line 635
    .line 636
    const/4 v2, 0x1

    .line 637
    iput-boolean v2, v0, Ll6/j;->F:Z

    .line 638
    .line 639
    :cond_1f
    :goto_12
    move/from16 v13, v18

    .line 640
    .line 641
    move/from16 v12, v20

    .line 642
    .line 643
    move-object/from16 v10, v25

    .line 644
    .line 645
    goto/16 :goto_d

    .line 646
    .line 647
    :cond_20
    const-string v1, "Invalid NAL length"

    .line 648
    .line 649
    const/4 v2, 0x0

    .line 650
    invoke-static {v2, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    throw v1

    .line 655
    :cond_21
    move-object/from16 v25, v10

    .line 656
    .line 657
    move/from16 v18, v13

    .line 658
    .line 659
    const/4 v10, 0x6

    .line 660
    iget-boolean v12, v0, Ll6/j;->G:Z

    .line 661
    .line 662
    if-eqz v12, :cond_26

    .line 663
    .line 664
    iget-object v12, v0, Ll6/j;->g:Lp4/s;

    .line 665
    .line 666
    invoke-virtual {v12, v2}, Lp4/s;->D(I)V

    .line 667
    .line 668
    .line 669
    iget-object v2, v12, Lp4/s;->a:[B

    .line 670
    .line 671
    iget v13, v0, Ll6/j;->E:I

    .line 672
    .line 673
    const/4 v10, 0x0

    .line 674
    invoke-interface {v1, v2, v10, v13}, Lr5/o;->readFully([BII)V

    .line 675
    .line 676
    .line 677
    iget v2, v0, Ll6/j;->E:I

    .line 678
    .line 679
    invoke-interface {v3, v2, v12}, Lr5/h0;->e(ILp4/s;)V

    .line 680
    .line 681
    .line 682
    iget v2, v0, Ll6/j;->E:I

    .line 683
    .line 684
    iget-object v13, v12, Lp4/s;->a:[B

    .line 685
    .line 686
    move/from16 v24, v2

    .line 687
    .line 688
    iget v2, v12, Lp4/s;->c:I

    .line 689
    .line 690
    invoke-static {v13, v2}, Lq4/p;->l([BI)I

    .line 691
    .line 692
    .line 693
    move-result v2

    .line 694
    invoke-virtual {v12, v10}, Lp4/s;->G(I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v2}, Lp4/s;->F(I)V

    .line 698
    .line 699
    .line 700
    iget v2, v11, Lm4/q;->p:I

    .line 701
    .line 702
    const/4 v13, -0x1

    .line 703
    if-ne v2, v13, :cond_22

    .line 704
    .line 705
    iget v2, v7, Lh7/i;->a:I

    .line 706
    .line 707
    if-eqz v2, :cond_24

    .line 708
    .line 709
    iput v10, v7, Lh7/i;->a:I

    .line 710
    .line 711
    invoke-virtual {v7, v10}, Lh7/i;->b(I)V

    .line 712
    .line 713
    .line 714
    goto :goto_14

    .line 715
    :cond_22
    iget v10, v7, Lh7/i;->a:I

    .line 716
    .line 717
    if-eq v10, v2, :cond_24

    .line 718
    .line 719
    if-ltz v2, :cond_23

    .line 720
    .line 721
    const/4 v10, 0x1

    .line 722
    goto :goto_13

    .line 723
    :cond_23
    const/4 v10, 0x0

    .line 724
    :goto_13
    invoke-static {v10}, Lp4/c;->i(Z)V

    .line 725
    .line 726
    .line 727
    iput v2, v7, Lh7/i;->a:I

    .line 728
    .line 729
    invoke-virtual {v7, v2}, Lh7/i;->b(I)V

    .line 730
    .line 731
    .line 732
    :cond_24
    :goto_14
    invoke-virtual {v7, v5, v6, v12}, Lh7/i;->a(JLp4/s;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v17 .. v17}, Ll6/i;->a()I

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    const/16 v21, 0x4

    .line 740
    .line 741
    and-int/lit8 v2, v2, 0x4

    .line 742
    .line 743
    const/4 v13, 0x0

    .line 744
    if-eqz v2, :cond_25

    .line 745
    .line 746
    invoke-virtual {v7, v13}, Lh7/i;->b(I)V

    .line 747
    .line 748
    .line 749
    :cond_25
    move/from16 v2, v24

    .line 750
    .line 751
    goto :goto_15

    .line 752
    :cond_26
    const/4 v13, 0x0

    .line 753
    invoke-interface {v3, v1, v2, v13}, Lr5/h0;->d(Lm4/i;IZ)I

    .line 754
    .line 755
    .line 756
    move-result v2

    .line 757
    :goto_15
    iget v10, v0, Ll6/j;->D:I

    .line 758
    .line 759
    add-int/2addr v10, v2

    .line 760
    iput v10, v0, Ll6/j;->D:I

    .line 761
    .line 762
    iget v10, v0, Ll6/j;->E:I

    .line 763
    .line 764
    sub-int/2addr v10, v2

    .line 765
    iput v10, v0, Ll6/j;->E:I

    .line 766
    .line 767
    goto/16 :goto_12

    .line 768
    .line 769
    :cond_27
    move-object/from16 v17, v2

    .line 770
    .line 771
    :goto_16
    iget v2, v0, Ll6/j;->D:I

    .line 772
    .line 773
    iget v7, v0, Ll6/j;->C:I

    .line 774
    .line 775
    if-ge v2, v7, :cond_28

    .line 776
    .line 777
    sub-int/2addr v7, v2

    .line 778
    const/4 v13, 0x0

    .line 779
    invoke-interface {v3, v1, v7, v13}, Lr5/h0;->d(Lm4/i;IZ)I

    .line 780
    .line 781
    .line 782
    move-result v2

    .line 783
    iget v7, v0, Ll6/j;->D:I

    .line 784
    .line 785
    add-int/2addr v7, v2

    .line 786
    iput v7, v0, Ll6/j;->D:I

    .line 787
    .line 788
    goto :goto_16

    .line 789
    :cond_28
    invoke-virtual/range {v17 .. v17}, Ll6/i;->a()I

    .line 790
    .line 791
    .line 792
    move-result v1

    .line 793
    iget-boolean v2, v0, Ll6/j;->F:Z

    .line 794
    .line 795
    if-nez v2, :cond_29

    .line 796
    .line 797
    const/high16 v2, 0x4000000

    .line 798
    .line 799
    or-int/2addr v1, v2

    .line 800
    :cond_29
    move/from16 v27, v1

    .line 801
    .line 802
    invoke-virtual/range {v17 .. v17}, Ll6/i;->b()Ll6/r;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    if-eqz v1, :cond_2a

    .line 807
    .line 808
    iget-object v1, v1, Ll6/r;->c:Lr5/g0;

    .line 809
    .line 810
    move-object/from16 v30, v1

    .line 811
    .line 812
    goto :goto_17

    .line 813
    :cond_2a
    const/16 v30, 0x0

    .line 814
    .line 815
    :goto_17
    iget v1, v0, Ll6/j;->C:I

    .line 816
    .line 817
    const/16 v29, 0x0

    .line 818
    .line 819
    move/from16 v28, v1

    .line 820
    .line 821
    move-object/from16 v24, v3

    .line 822
    .line 823
    move-wide/from16 v25, v5

    .line 824
    .line 825
    invoke-interface/range {v24 .. v30}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 826
    .line 827
    .line 828
    :cond_2b
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 829
    .line 830
    .line 831
    move-result v1

    .line 832
    if-nez v1, :cond_2e

    .line 833
    .line 834
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    check-cast v1, Ll6/h;

    .line 839
    .line 840
    iget v2, v0, Ll6/j;->x:I

    .line 841
    .line 842
    iget v3, v1, Ll6/h;->c:I

    .line 843
    .line 844
    sub-int/2addr v2, v3

    .line 845
    iput v2, v0, Ll6/j;->x:I

    .line 846
    .line 847
    iget-wide v2, v1, Ll6/h;->a:J

    .line 848
    .line 849
    iget-boolean v5, v1, Ll6/h;->b:Z

    .line 850
    .line 851
    if-eqz v5, :cond_2c

    .line 852
    .line 853
    add-long v2, v2, v25

    .line 854
    .line 855
    :cond_2c
    if-eqz v4, :cond_2d

    .line 856
    .line 857
    invoke-virtual {v4, v2, v3}, Lp4/y;->a(J)J

    .line 858
    .line 859
    .line 860
    move-result-wide v2

    .line 861
    :cond_2d
    move-wide v6, v2

    .line 862
    iget-object v2, v0, Ll6/j;->I:[Lr5/h0;

    .line 863
    .line 864
    array-length v3, v2

    .line 865
    const/4 v12, 0x0

    .line 866
    :goto_18
    if-ge v12, v3, :cond_2b

    .line 867
    .line 868
    aget-object v5, v2, v12

    .line 869
    .line 870
    iget v9, v1, Ll6/h;->c:I

    .line 871
    .line 872
    iget v10, v0, Ll6/j;->x:I

    .line 873
    .line 874
    const/4 v11, 0x0

    .line 875
    const/4 v8, 0x1

    .line 876
    invoke-interface/range {v5 .. v11}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 877
    .line 878
    .line 879
    add-int/lit8 v12, v12, 0x1

    .line 880
    .line 881
    goto :goto_18

    .line 882
    :cond_2e
    invoke-virtual/range {v17 .. v17}, Ll6/i;->c()Z

    .line 883
    .line 884
    .line 885
    move-result v1

    .line 886
    if-nez v1, :cond_2f

    .line 887
    .line 888
    const/4 v2, 0x0

    .line 889
    iput-object v2, v0, Ll6/j;->B:Ll6/i;

    .line 890
    .line 891
    :cond_2f
    const/4 v11, 0x3

    .line 892
    iput v11, v0, Ll6/j;->r:I

    .line 893
    .line 894
    const/16 v31, 0x0

    .line 895
    .line 896
    return v31

    .line 897
    :cond_30
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    const/4 v3, 0x0

    .line 902
    const/4 v4, 0x0

    .line 903
    :goto_19
    if-ge v4, v2, :cond_32

    .line 904
    .line 905
    invoke-virtual {v8, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v5

    .line 909
    check-cast v5, Ll6/i;

    .line 910
    .line 911
    iget-object v5, v5, Ll6/i;->b:Ll6/s;

    .line 912
    .line 913
    iget-boolean v6, v5, Ll6/s;->o:Z

    .line 914
    .line 915
    if-eqz v6, :cond_31

    .line 916
    .line 917
    iget-wide v5, v5, Ll6/s;->c:J

    .line 918
    .line 919
    cmp-long v7, v5, v16

    .line 920
    .line 921
    if-gez v7, :cond_31

    .line 922
    .line 923
    invoke-virtual {v8, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    check-cast v3, Ll6/i;

    .line 928
    .line 929
    move-wide/from16 v16, v5

    .line 930
    .line 931
    :cond_31
    add-int/lit8 v4, v4, 0x1

    .line 932
    .line 933
    goto :goto_19

    .line 934
    :cond_32
    if-nez v3, :cond_33

    .line 935
    .line 936
    const/4 v11, 0x3

    .line 937
    iput v11, v0, Ll6/j;->r:I

    .line 938
    .line 939
    goto/16 :goto_0

    .line 940
    .line 941
    :cond_33
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 942
    .line 943
    .line 944
    move-result-wide v4

    .line 945
    sub-long v4, v16, v4

    .line 946
    .line 947
    long-to-int v2, v4

    .line 948
    if-ltz v2, :cond_34

    .line 949
    .line 950
    invoke-interface {v1, v2}, Lr5/o;->r(I)V

    .line 951
    .line 952
    .line 953
    iget-object v2, v3, Ll6/i;->b:Ll6/s;

    .line 954
    .line 955
    iget-object v3, v2, Ll6/s;->n:Lp4/s;

    .line 956
    .line 957
    iget-object v4, v3, Lp4/s;->a:[B

    .line 958
    .line 959
    iget v5, v3, Lp4/s;->c:I

    .line 960
    .line 961
    const/4 v13, 0x0

    .line 962
    invoke-interface {v1, v4, v13, v5}, Lr5/o;->readFully([BII)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v3, v13}, Lp4/s;->G(I)V

    .line 966
    .line 967
    .line 968
    iput-boolean v13, v2, Ll6/s;->o:Z

    .line 969
    .line 970
    goto/16 :goto_0

    .line 971
    .line 972
    :cond_34
    const-string v1, "Offset to encryption data was negative."

    .line 973
    .line 974
    const/4 v2, 0x0

    .line 975
    invoke-static {v2, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    throw v1

    .line 980
    :cond_35
    const/16 v18, 0x2

    .line 981
    .line 982
    iget-wide v2, v0, Ll6/j;->t:J

    .line 983
    .line 984
    iget v6, v0, Ll6/j;->u:I

    .line 985
    .line 986
    int-to-long v6, v6

    .line 987
    sub-long/2addr v2, v6

    .line 988
    long-to-int v3, v2

    .line 989
    iget-object v2, v0, Ll6/j;->v:Lp4/s;

    .line 990
    .line 991
    if-eqz v2, :cond_44

    .line 992
    .line 993
    iget-object v6, v2, Lp4/s;->a:[B

    .line 994
    .line 995
    const/16 v7, 0x8

    .line 996
    .line 997
    invoke-interface {v1, v6, v7, v3}, Lr5/o;->readFully([BII)V

    .line 998
    .line 999
    .line 1000
    new-instance v3, Lq4/c;

    .line 1001
    .line 1002
    iget v6, v0, Ll6/j;->s:I

    .line 1003
    .line 1004
    invoke-direct {v3, v6, v2}, Lq4/c;-><init>(ILp4/s;)V

    .line 1005
    .line 1006
    .line 1007
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v7

    .line 1011
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1012
    .line 1013
    .line 1014
    move-result v9

    .line 1015
    if-nez v9, :cond_36

    .line 1016
    .line 1017
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    check-cast v2, Lq4/b;

    .line 1022
    .line 1023
    iget-object v2, v2, Lq4/b;->d:Ljava/util/ArrayList;

    .line 1024
    .line 1025
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    goto/16 :goto_22

    .line 1029
    .line 1030
    :cond_36
    const v3, 0x73696478

    .line 1031
    .line 1032
    .line 1033
    if-ne v6, v3, :cond_3a

    .line 1034
    .line 1035
    const/16 v3, 0x8

    .line 1036
    .line 1037
    invoke-virtual {v2, v3}, Lp4/s;->G(I)V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v2}, Lp4/s;->g()I

    .line 1041
    .line 1042
    .line 1043
    move-result v3

    .line 1044
    invoke-static {v3}, Ll6/e;->c(I)I

    .line 1045
    .line 1046
    .line 1047
    move-result v3

    .line 1048
    const/4 v13, 0x4

    .line 1049
    invoke-virtual {v2, v13}, Lp4/s;->H(I)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1053
    .line 1054
    .line 1055
    move-result-wide v28

    .line 1056
    if-nez v3, :cond_37

    .line 1057
    .line 1058
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1059
    .line 1060
    .line 1061
    move-result-wide v3

    .line 1062
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1063
    .line 1064
    .line 1065
    move-result-wide v5

    .line 1066
    :goto_1a
    add-long/2addr v5, v7

    .line 1067
    move-wide/from16 v24, v3

    .line 1068
    .line 1069
    goto :goto_1b

    .line 1070
    :cond_37
    invoke-virtual {v2}, Lp4/s;->z()J

    .line 1071
    .line 1072
    .line 1073
    move-result-wide v3

    .line 1074
    invoke-virtual {v2}, Lp4/s;->z()J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v5

    .line 1078
    goto :goto_1a

    .line 1079
    :goto_1b
    sget v3, Lp4/c0;->a:I

    .line 1080
    .line 1081
    sget-object v30, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1082
    .line 1083
    const-wide/32 v26, 0xf4240

    .line 1084
    .line 1085
    .line 1086
    invoke-static/range {v24 .. v30}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 1087
    .line 1088
    .line 1089
    move-result-wide v3

    .line 1090
    const/4 v7, 0x2

    .line 1091
    invoke-virtual {v2, v7}, Lp4/s;->H(I)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v2}, Lp4/s;->A()I

    .line 1095
    .line 1096
    .line 1097
    move-result v7

    .line 1098
    new-array v8, v7, [I

    .line 1099
    .line 1100
    new-array v9, v7, [J

    .line 1101
    .line 1102
    new-array v10, v7, [J

    .line 1103
    .line 1104
    new-array v11, v7, [J

    .line 1105
    .line 1106
    move-wide v14, v3

    .line 1107
    const/4 v13, 0x0

    .line 1108
    :goto_1c
    if-ge v13, v7, :cond_39

    .line 1109
    .line 1110
    invoke-virtual {v2}, Lp4/s;->g()I

    .line 1111
    .line 1112
    .line 1113
    move-result v12

    .line 1114
    const/high16 v16, -0x80000000

    .line 1115
    .line 1116
    and-int v16, v12, v16

    .line 1117
    .line 1118
    if-nez v16, :cond_38

    .line 1119
    .line 1120
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1121
    .line 1122
    .line 1123
    move-result-wide v16

    .line 1124
    const v18, 0x7fffffff

    .line 1125
    .line 1126
    .line 1127
    and-int v12, v12, v18

    .line 1128
    .line 1129
    aput v12, v8, v13

    .line 1130
    .line 1131
    aput-wide v5, v9, v13

    .line 1132
    .line 1133
    aput-wide v14, v11, v13

    .line 1134
    .line 1135
    add-long v24, v24, v16

    .line 1136
    .line 1137
    const-wide/32 v26, 0xf4240

    .line 1138
    .line 1139
    .line 1140
    sget-object v30, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1141
    .line 1142
    invoke-static/range {v24 .. v30}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v14

    .line 1146
    aget-wide v16, v11, v13

    .line 1147
    .line 1148
    sub-long v16, v14, v16

    .line 1149
    .line 1150
    aput-wide v16, v10, v13

    .line 1151
    .line 1152
    const/4 v12, 0x4

    .line 1153
    invoke-virtual {v2, v12}, Lp4/s;->H(I)V

    .line 1154
    .line 1155
    .line 1156
    aget v12, v8, v13

    .line 1157
    .line 1158
    move-wide/from16 v16, v3

    .line 1159
    .line 1160
    int-to-long v3, v12

    .line 1161
    add-long/2addr v5, v3

    .line 1162
    add-int/lit8 v13, v13, 0x1

    .line 1163
    .line 1164
    move-wide/from16 v3, v16

    .line 1165
    .line 1166
    goto :goto_1c

    .line 1167
    :cond_38
    const-string v1, "Unhandled indirect reference"

    .line 1168
    .line 1169
    const/4 v2, 0x0

    .line 1170
    invoke-static {v2, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v1

    .line 1174
    throw v1

    .line 1175
    :cond_39
    move-wide/from16 v16, v3

    .line 1176
    .line 1177
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    new-instance v3, Lr5/j;

    .line 1182
    .line 1183
    invoke-direct {v3, v8, v9, v10, v11}, Lr5/j;-><init>([I[J[J[J)V

    .line 1184
    .line 1185
    .line 1186
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1191
    .line 1192
    check-cast v3, Ljava/lang/Long;

    .line 1193
    .line 1194
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1195
    .line 1196
    .line 1197
    move-result-wide v3

    .line 1198
    iput-wide v3, v0, Ll6/j;->A:J

    .line 1199
    .line 1200
    iget-object v3, v0, Ll6/j;->H:Lr5/q;

    .line 1201
    .line 1202
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v2, Lr5/b0;

    .line 1205
    .line 1206
    invoke-interface {v3, v2}, Lr5/q;->a(Lr5/b0;)V

    .line 1207
    .line 1208
    .line 1209
    const/4 v2, 0x1

    .line 1210
    iput-boolean v2, v0, Ll6/j;->K:Z

    .line 1211
    .line 1212
    goto/16 :goto_22

    .line 1213
    .line 1214
    :cond_3a
    const v3, 0x656d7367

    .line 1215
    .line 1216
    .line 1217
    if-ne v6, v3, :cond_45

    .line 1218
    .line 1219
    iget-object v3, v0, Ll6/j;->I:[Lr5/h0;

    .line 1220
    .line 1221
    array-length v3, v3

    .line 1222
    if-nez v3, :cond_3b

    .line 1223
    .line 1224
    goto/16 :goto_22

    .line 1225
    .line 1226
    :cond_3b
    const/16 v3, 0x8

    .line 1227
    .line 1228
    invoke-virtual {v2, v3}, Lp4/s;->G(I)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v2}, Lp4/s;->g()I

    .line 1232
    .line 1233
    .line 1234
    move-result v3

    .line 1235
    invoke-static {v3}, Ll6/e;->c(I)I

    .line 1236
    .line 1237
    .line 1238
    move-result v3

    .line 1239
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    if-eqz v3, :cond_3d

    .line 1245
    .line 1246
    const/4 v11, 0x1

    .line 1247
    if-eq v3, v11, :cond_3c

    .line 1248
    .line 1249
    const-string v2, "Skipping unsupported emsg version: "

    .line 1250
    .line 1251
    invoke-static {v3, v2, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 1252
    .line 1253
    .line 1254
    goto/16 :goto_22

    .line 1255
    .line 1256
    :cond_3c
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1257
    .line 1258
    .line 1259
    move-result-wide v11

    .line 1260
    invoke-virtual {v2}, Lp4/s;->z()J

    .line 1261
    .line 1262
    .line 1263
    move-result-wide v7

    .line 1264
    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1265
    .line 1266
    const-wide/32 v9, 0xf4240

    .line 1267
    .line 1268
    .line 1269
    invoke-static/range {v7 .. v13}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 1270
    .line 1271
    .line 1272
    move-result-wide v15

    .line 1273
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1274
    .line 1275
    .line 1276
    move-result-wide v7

    .line 1277
    const-wide/16 v9, 0x3e8

    .line 1278
    .line 1279
    invoke-static/range {v7 .. v13}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 1280
    .line 1281
    .line 1282
    move-result-wide v7

    .line 1283
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1284
    .line 1285
    .line 1286
    move-result-wide v9

    .line 1287
    invoke-virtual {v2}, Lp4/s;->p()Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v2}, Lp4/s;->p()Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v11

    .line 1298
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1299
    .line 1300
    .line 1301
    move-wide/from16 v26, v7

    .line 1302
    .line 1303
    move-wide/from16 v28, v9

    .line 1304
    .line 1305
    move-wide v9, v15

    .line 1306
    move-wide v7, v5

    .line 1307
    :goto_1d
    move-object/from16 v24, v3

    .line 1308
    .line 1309
    move-object/from16 v25, v11

    .line 1310
    .line 1311
    goto :goto_1f

    .line 1312
    :cond_3d
    invoke-virtual {v2}, Lp4/s;->p()Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v3

    .line 1316
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v2}, Lp4/s;->p()Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v11

    .line 1323
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1327
    .line 1328
    .line 1329
    move-result-wide v19

    .line 1330
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1331
    .line 1332
    .line 1333
    move-result-wide v15

    .line 1334
    sget-object v21, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1335
    .line 1336
    const-wide/32 v17, 0xf4240

    .line 1337
    .line 1338
    .line 1339
    invoke-static/range {v15 .. v21}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v7

    .line 1343
    iget-wide v9, v0, Ll6/j;->A:J

    .line 1344
    .line 1345
    cmp-long v12, v9, v5

    .line 1346
    .line 1347
    if-eqz v12, :cond_3e

    .line 1348
    .line 1349
    add-long/2addr v9, v7

    .line 1350
    goto :goto_1e

    .line 1351
    :cond_3e
    move-wide v9, v5

    .line 1352
    :goto_1e
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1353
    .line 1354
    .line 1355
    move-result-wide v15

    .line 1356
    const-wide/16 v17, 0x3e8

    .line 1357
    .line 1358
    invoke-static/range {v15 .. v21}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 1359
    .line 1360
    .line 1361
    move-result-wide v12

    .line 1362
    invoke-virtual {v2}, Lp4/s;->w()J

    .line 1363
    .line 1364
    .line 1365
    move-result-wide v15

    .line 1366
    move-wide/from16 v26, v12

    .line 1367
    .line 1368
    move-wide/from16 v28, v15

    .line 1369
    .line 1370
    goto :goto_1d

    .line 1371
    :goto_1f
    invoke-virtual {v2}, Lp4/s;->a()I

    .line 1372
    .line 1373
    .line 1374
    move-result v3

    .line 1375
    new-array v3, v3, [B

    .line 1376
    .line 1377
    invoke-virtual {v2}, Lp4/s;->a()I

    .line 1378
    .line 1379
    .line 1380
    move-result v11

    .line 1381
    const/4 v13, 0x0

    .line 1382
    invoke-virtual {v2, v3, v13, v11}, Lp4/s;->e([BII)V

    .line 1383
    .line 1384
    .line 1385
    new-instance v23, Lc6/a;

    .line 1386
    .line 1387
    move-object/from16 v30, v3

    .line 1388
    .line 1389
    invoke-direct/range {v23 .. v30}, Lc6/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 1390
    .line 1391
    .line 1392
    move-object/from16 v2, v23

    .line 1393
    .line 1394
    new-instance v3, Lp4/s;

    .line 1395
    .line 1396
    iget-object v11, v0, Ll6/j;->k:Landroidx/media3/exoplayer/offline/u;

    .line 1397
    .line 1398
    invoke-virtual {v11, v2}, Landroidx/media3/exoplayer/offline/u;->U0(Lc6/a;)[B

    .line 1399
    .line 1400
    .line 1401
    move-result-object v2

    .line 1402
    invoke-direct {v3, v2}, Lp4/s;-><init>([B)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v3}, Lp4/s;->a()I

    .line 1406
    .line 1407
    .line 1408
    move-result v2

    .line 1409
    iget-object v11, v0, Ll6/j;->I:[Lr5/h0;

    .line 1410
    .line 1411
    array-length v12, v11

    .line 1412
    const/4 v13, 0x0

    .line 1413
    :goto_20
    if-ge v13, v12, :cond_3f

    .line 1414
    .line 1415
    aget-object v15, v11, v13

    .line 1416
    .line 1417
    move-wide/from16 v16, v5

    .line 1418
    .line 1419
    const/4 v5, 0x0

    .line 1420
    invoke-virtual {v3, v5}, Lp4/s;->G(I)V

    .line 1421
    .line 1422
    .line 1423
    invoke-interface {v15, v2, v3}, Lr5/h0;->e(ILp4/s;)V

    .line 1424
    .line 1425
    .line 1426
    add-int/lit8 v13, v13, 0x1

    .line 1427
    .line 1428
    move-wide/from16 v5, v16

    .line 1429
    .line 1430
    goto :goto_20

    .line 1431
    :cond_3f
    move-wide/from16 v16, v5

    .line 1432
    .line 1433
    cmp-long v3, v9, v16

    .line 1434
    .line 1435
    if-nez v3, :cond_40

    .line 1436
    .line 1437
    new-instance v3, Ll6/h;

    .line 1438
    .line 1439
    const/4 v11, 0x1

    .line 1440
    invoke-direct {v3, v2, v11, v7, v8}, Ll6/h;-><init>(IZJ)V

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1444
    .line 1445
    .line 1446
    iget v3, v0, Ll6/j;->x:I

    .line 1447
    .line 1448
    add-int/2addr v3, v2

    .line 1449
    iput v3, v0, Ll6/j;->x:I

    .line 1450
    .line 1451
    goto :goto_22

    .line 1452
    :cond_40
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1453
    .line 1454
    .line 1455
    move-result v3

    .line 1456
    if-nez v3, :cond_41

    .line 1457
    .line 1458
    new-instance v3, Ll6/h;

    .line 1459
    .line 1460
    const/4 v13, 0x0

    .line 1461
    invoke-direct {v3, v2, v13, v9, v10}, Ll6/h;-><init>(IZJ)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1465
    .line 1466
    .line 1467
    iget v3, v0, Ll6/j;->x:I

    .line 1468
    .line 1469
    add-int/2addr v3, v2

    .line 1470
    iput v3, v0, Ll6/j;->x:I

    .line 1471
    .line 1472
    goto :goto_22

    .line 1473
    :cond_41
    const/4 v13, 0x0

    .line 1474
    if-eqz v4, :cond_42

    .line 1475
    .line 1476
    invoke-virtual {v4}, Lp4/y;->f()Z

    .line 1477
    .line 1478
    .line 1479
    move-result v3

    .line 1480
    if-nez v3, :cond_42

    .line 1481
    .line 1482
    new-instance v3, Ll6/h;

    .line 1483
    .line 1484
    invoke-direct {v3, v2, v13, v9, v10}, Ll6/h;-><init>(IZJ)V

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1488
    .line 1489
    .line 1490
    iget v3, v0, Ll6/j;->x:I

    .line 1491
    .line 1492
    add-int/2addr v3, v2

    .line 1493
    iput v3, v0, Ll6/j;->x:I

    .line 1494
    .line 1495
    goto :goto_22

    .line 1496
    :cond_42
    if-eqz v4, :cond_43

    .line 1497
    .line 1498
    invoke-virtual {v4, v9, v10}, Lp4/y;->a(J)J

    .line 1499
    .line 1500
    .line 1501
    move-result-wide v9

    .line 1502
    :cond_43
    move-wide/from16 v16, v9

    .line 1503
    .line 1504
    iget-object v3, v0, Ll6/j;->I:[Lr5/h0;

    .line 1505
    .line 1506
    array-length v4, v3

    .line 1507
    const/4 v13, 0x0

    .line 1508
    :goto_21
    if-ge v13, v4, :cond_45

    .line 1509
    .line 1510
    aget-object v15, v3, v13

    .line 1511
    .line 1512
    const/16 v20, 0x0

    .line 1513
    .line 1514
    const/16 v21, 0x0

    .line 1515
    .line 1516
    const/16 v18, 0x1

    .line 1517
    .line 1518
    move/from16 v19, v2

    .line 1519
    .line 1520
    invoke-interface/range {v15 .. v21}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 1521
    .line 1522
    .line 1523
    add-int/lit8 v13, v13, 0x1

    .line 1524
    .line 1525
    goto :goto_21

    .line 1526
    :cond_44
    invoke-interface {v1, v3}, Lr5/o;->r(I)V

    .line 1527
    .line 1528
    .line 1529
    :cond_45
    :goto_22
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 1530
    .line 1531
    .line 1532
    move-result-wide v2

    .line 1533
    invoke-virtual {v0, v2, v3}, Ll6/j;->e(J)V

    .line 1534
    .line 1535
    .line 1536
    goto/16 :goto_0

    .line 1537
    .line 1538
    :cond_46
    iget v2, v0, Ll6/j;->u:I

    .line 1539
    .line 1540
    iget-object v3, v0, Ll6/j;->l:Lp4/s;

    .line 1541
    .line 1542
    if-nez v2, :cond_48

    .line 1543
    .line 1544
    iget-object v2, v3, Lp4/s;->a:[B

    .line 1545
    .line 1546
    const/16 v6, 0x8

    .line 1547
    .line 1548
    const/4 v11, 0x1

    .line 1549
    const/4 v13, 0x0

    .line 1550
    invoke-interface {v1, v2, v13, v6, v11}, Lr5/o;->d([BIIZ)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v2

    .line 1554
    if-nez v2, :cond_47

    .line 1555
    .line 1556
    invoke-virtual {v7, v13}, Lh7/i;->b(I)V

    .line 1557
    .line 1558
    .line 1559
    const/16 v19, -0x1

    .line 1560
    .line 1561
    return v19

    .line 1562
    :cond_47
    iput v6, v0, Ll6/j;->u:I

    .line 1563
    .line 1564
    invoke-virtual {v3, v13}, Lp4/s;->G(I)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v3}, Lp4/s;->w()J

    .line 1568
    .line 1569
    .line 1570
    move-result-wide v6

    .line 1571
    iput-wide v6, v0, Ll6/j;->t:J

    .line 1572
    .line 1573
    invoke-virtual {v3}, Lp4/s;->g()I

    .line 1574
    .line 1575
    .line 1576
    move-result v2

    .line 1577
    iput v2, v0, Ll6/j;->s:I

    .line 1578
    .line 1579
    :cond_48
    iget-wide v6, v0, Ll6/j;->t:J

    .line 1580
    .line 1581
    const-wide/16 v9, 0x1

    .line 1582
    .line 1583
    cmp-long v2, v6, v9

    .line 1584
    .line 1585
    if-nez v2, :cond_49

    .line 1586
    .line 1587
    iget-object v2, v3, Lp4/s;->a:[B

    .line 1588
    .line 1589
    const/16 v6, 0x8

    .line 1590
    .line 1591
    invoke-interface {v1, v2, v6, v6}, Lr5/o;->readFully([BII)V

    .line 1592
    .line 1593
    .line 1594
    iget v2, v0, Ll6/j;->u:I

    .line 1595
    .line 1596
    add-int/2addr v2, v6

    .line 1597
    iput v2, v0, Ll6/j;->u:I

    .line 1598
    .line 1599
    invoke-virtual {v3}, Lp4/s;->z()J

    .line 1600
    .line 1601
    .line 1602
    move-result-wide v6

    .line 1603
    iput-wide v6, v0, Ll6/j;->t:J

    .line 1604
    .line 1605
    goto :goto_23

    .line 1606
    :cond_49
    const-wide/16 v9, 0x0

    .line 1607
    .line 1608
    cmp-long v2, v6, v9

    .line 1609
    .line 1610
    if-nez v2, :cond_4b

    .line 1611
    .line 1612
    invoke-interface {v1}, Lr5/o;->getLength()J

    .line 1613
    .line 1614
    .line 1615
    move-result-wide v6

    .line 1616
    const-wide/16 v9, -0x1

    .line 1617
    .line 1618
    cmp-long v2, v6, v9

    .line 1619
    .line 1620
    if-nez v2, :cond_4a

    .line 1621
    .line 1622
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1623
    .line 1624
    .line 1625
    move-result v2

    .line 1626
    if-nez v2, :cond_4a

    .line 1627
    .line 1628
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    check-cast v2, Lq4/b;

    .line 1633
    .line 1634
    iget-wide v6, v2, Lq4/b;->c:J

    .line 1635
    .line 1636
    :cond_4a
    cmp-long v2, v6, v9

    .line 1637
    .line 1638
    if-eqz v2, :cond_4b

    .line 1639
    .line 1640
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 1641
    .line 1642
    .line 1643
    move-result-wide v9

    .line 1644
    sub-long/2addr v6, v9

    .line 1645
    iget v2, v0, Ll6/j;->u:I

    .line 1646
    .line 1647
    int-to-long v9, v2

    .line 1648
    add-long/2addr v6, v9

    .line 1649
    iput-wide v6, v0, Ll6/j;->t:J

    .line 1650
    .line 1651
    :cond_4b
    :goto_23
    iget-wide v6, v0, Ll6/j;->t:J

    .line 1652
    .line 1653
    iget v2, v0, Ll6/j;->u:I

    .line 1654
    .line 1655
    int-to-long v9, v2

    .line 1656
    cmp-long v2, v6, v9

    .line 1657
    .line 1658
    if-ltz v2, :cond_58

    .line 1659
    .line 1660
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 1661
    .line 1662
    .line 1663
    move-result-wide v6

    .line 1664
    iget v2, v0, Ll6/j;->u:I

    .line 1665
    .line 1666
    int-to-long v9, v2

    .line 1667
    sub-long/2addr v6, v9

    .line 1668
    iget v2, v0, Ll6/j;->s:I

    .line 1669
    .line 1670
    const v4, 0x6d646174

    .line 1671
    .line 1672
    .line 1673
    const v9, 0x6d6f6f66

    .line 1674
    .line 1675
    .line 1676
    if-eq v2, v9, :cond_4c

    .line 1677
    .line 1678
    if-ne v2, v4, :cond_4d

    .line 1679
    .line 1680
    :cond_4c
    iget-boolean v2, v0, Ll6/j;->K:Z

    .line 1681
    .line 1682
    if-nez v2, :cond_4d

    .line 1683
    .line 1684
    iget-object v2, v0, Ll6/j;->H:Lr5/q;

    .line 1685
    .line 1686
    new-instance v10, Lr5/s;

    .line 1687
    .line 1688
    iget-wide v11, v0, Ll6/j;->z:J

    .line 1689
    .line 1690
    invoke-direct {v10, v11, v12, v6, v7}, Lr5/s;-><init>(JJ)V

    .line 1691
    .line 1692
    .line 1693
    invoke-interface {v2, v10}, Lr5/q;->a(Lr5/b0;)V

    .line 1694
    .line 1695
    .line 1696
    const/4 v11, 0x1

    .line 1697
    iput-boolean v11, v0, Ll6/j;->K:Z

    .line 1698
    .line 1699
    :cond_4d
    iget v2, v0, Ll6/j;->s:I

    .line 1700
    .line 1701
    if-ne v2, v9, :cond_4e

    .line 1702
    .line 1703
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 1704
    .line 1705
    .line 1706
    move-result v2

    .line 1707
    const/4 v10, 0x0

    .line 1708
    :goto_24
    if-ge v10, v2, :cond_4e

    .line 1709
    .line 1710
    invoke-virtual {v8, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v11

    .line 1714
    check-cast v11, Ll6/i;

    .line 1715
    .line 1716
    iget-object v11, v11, Ll6/i;->b:Ll6/s;

    .line 1717
    .line 1718
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1719
    .line 1720
    .line 1721
    iput-wide v6, v11, Ll6/s;->c:J

    .line 1722
    .line 1723
    iput-wide v6, v11, Ll6/s;->b:J

    .line 1724
    .line 1725
    add-int/lit8 v10, v10, 0x1

    .line 1726
    .line 1727
    goto :goto_24

    .line 1728
    :cond_4e
    iget v2, v0, Ll6/j;->s:I

    .line 1729
    .line 1730
    if-ne v2, v4, :cond_4f

    .line 1731
    .line 1732
    const/4 v4, 0x0

    .line 1733
    iput-object v4, v0, Ll6/j;->B:Ll6/i;

    .line 1734
    .line 1735
    iget-wide v2, v0, Ll6/j;->t:J

    .line 1736
    .line 1737
    add-long/2addr v6, v2

    .line 1738
    iput-wide v6, v0, Ll6/j;->w:J

    .line 1739
    .line 1740
    const/4 v7, 0x2

    .line 1741
    iput v7, v0, Ll6/j;->r:I

    .line 1742
    .line 1743
    goto/16 :goto_0

    .line 1744
    .line 1745
    :cond_4f
    const v4, 0x6d6f6f76

    .line 1746
    .line 1747
    .line 1748
    if-eq v2, v4, :cond_56

    .line 1749
    .line 1750
    const v4, 0x7472616b

    .line 1751
    .line 1752
    .line 1753
    if-eq v2, v4, :cond_56

    .line 1754
    .line 1755
    const v4, 0x6d646961

    .line 1756
    .line 1757
    .line 1758
    if-eq v2, v4, :cond_56

    .line 1759
    .line 1760
    const v4, 0x6d696e66

    .line 1761
    .line 1762
    .line 1763
    if-eq v2, v4, :cond_56

    .line 1764
    .line 1765
    const v4, 0x7374626c

    .line 1766
    .line 1767
    .line 1768
    if-eq v2, v4, :cond_56

    .line 1769
    .line 1770
    if-eq v2, v9, :cond_56

    .line 1771
    .line 1772
    const v4, 0x74726166

    .line 1773
    .line 1774
    .line 1775
    if-eq v2, v4, :cond_56

    .line 1776
    .line 1777
    const v4, 0x6d766578

    .line 1778
    .line 1779
    .line 1780
    if-eq v2, v4, :cond_56

    .line 1781
    .line 1782
    const v4, 0x65647473

    .line 1783
    .line 1784
    .line 1785
    if-ne v2, v4, :cond_50

    .line 1786
    .line 1787
    goto/16 :goto_26

    .line 1788
    .line 1789
    :cond_50
    const v4, 0x68646c72    # 4.3148E24f

    .line 1790
    .line 1791
    .line 1792
    const-wide/32 v5, 0x7fffffff

    .line 1793
    .line 1794
    .line 1795
    if-eq v2, v4, :cond_53

    .line 1796
    .line 1797
    const v4, 0x6d646864

    .line 1798
    .line 1799
    .line 1800
    if-eq v2, v4, :cond_53

    .line 1801
    .line 1802
    const v4, 0x6d766864

    .line 1803
    .line 1804
    .line 1805
    if-eq v2, v4, :cond_53

    .line 1806
    .line 1807
    const v4, 0x73696478

    .line 1808
    .line 1809
    .line 1810
    if-eq v2, v4, :cond_53

    .line 1811
    .line 1812
    const v4, 0x73747364

    .line 1813
    .line 1814
    .line 1815
    if-eq v2, v4, :cond_53

    .line 1816
    .line 1817
    const v4, 0x73747473

    .line 1818
    .line 1819
    .line 1820
    if-eq v2, v4, :cond_53

    .line 1821
    .line 1822
    const v4, 0x63747473

    .line 1823
    .line 1824
    .line 1825
    if-eq v2, v4, :cond_53

    .line 1826
    .line 1827
    const v4, 0x73747363

    .line 1828
    .line 1829
    .line 1830
    if-eq v2, v4, :cond_53

    .line 1831
    .line 1832
    const v4, 0x7374737a

    .line 1833
    .line 1834
    .line 1835
    if-eq v2, v4, :cond_53

    .line 1836
    .line 1837
    const v4, 0x73747a32

    .line 1838
    .line 1839
    .line 1840
    if-eq v2, v4, :cond_53

    .line 1841
    .line 1842
    const v4, 0x7374636f

    .line 1843
    .line 1844
    .line 1845
    if-eq v2, v4, :cond_53

    .line 1846
    .line 1847
    const v4, 0x636f3634

    .line 1848
    .line 1849
    .line 1850
    if-eq v2, v4, :cond_53

    .line 1851
    .line 1852
    const v4, 0x73747373

    .line 1853
    .line 1854
    .line 1855
    if-eq v2, v4, :cond_53

    .line 1856
    .line 1857
    const v4, 0x74666474

    .line 1858
    .line 1859
    .line 1860
    if-eq v2, v4, :cond_53

    .line 1861
    .line 1862
    const v4, 0x74666864

    .line 1863
    .line 1864
    .line 1865
    if-eq v2, v4, :cond_53

    .line 1866
    .line 1867
    const v4, 0x746b6864

    .line 1868
    .line 1869
    .line 1870
    if-eq v2, v4, :cond_53

    .line 1871
    .line 1872
    const v4, 0x74726578

    .line 1873
    .line 1874
    .line 1875
    if-eq v2, v4, :cond_53

    .line 1876
    .line 1877
    const v4, 0x7472756e

    .line 1878
    .line 1879
    .line 1880
    if-eq v2, v4, :cond_53

    .line 1881
    .line 1882
    const v4, 0x70737368    # 3.013775E29f

    .line 1883
    .line 1884
    .line 1885
    if-eq v2, v4, :cond_53

    .line 1886
    .line 1887
    const v4, 0x7361697a

    .line 1888
    .line 1889
    .line 1890
    if-eq v2, v4, :cond_53

    .line 1891
    .line 1892
    const v4, 0x7361696f

    .line 1893
    .line 1894
    .line 1895
    if-eq v2, v4, :cond_53

    .line 1896
    .line 1897
    const v4, 0x73656e63

    .line 1898
    .line 1899
    .line 1900
    if-eq v2, v4, :cond_53

    .line 1901
    .line 1902
    const v4, 0x75756964

    .line 1903
    .line 1904
    .line 1905
    if-eq v2, v4, :cond_53

    .line 1906
    .line 1907
    const v4, 0x73626770

    .line 1908
    .line 1909
    .line 1910
    if-eq v2, v4, :cond_53

    .line 1911
    .line 1912
    const v4, 0x73677064

    .line 1913
    .line 1914
    .line 1915
    if-eq v2, v4, :cond_53

    .line 1916
    .line 1917
    const v4, 0x656c7374

    .line 1918
    .line 1919
    .line 1920
    if-eq v2, v4, :cond_53

    .line 1921
    .line 1922
    const v4, 0x6d656864

    .line 1923
    .line 1924
    .line 1925
    if-eq v2, v4, :cond_53

    .line 1926
    .line 1927
    const v4, 0x656d7367

    .line 1928
    .line 1929
    .line 1930
    if-ne v2, v4, :cond_51

    .line 1931
    .line 1932
    goto :goto_25

    .line 1933
    :cond_51
    iget-wide v2, v0, Ll6/j;->t:J

    .line 1934
    .line 1935
    cmp-long v4, v2, v5

    .line 1936
    .line 1937
    if-gtz v4, :cond_52

    .line 1938
    .line 1939
    const/4 v2, 0x0

    .line 1940
    iput-object v2, v0, Ll6/j;->v:Lp4/s;

    .line 1941
    .line 1942
    const/4 v11, 0x1

    .line 1943
    iput v11, v0, Ll6/j;->r:I

    .line 1944
    .line 1945
    goto/16 :goto_0

    .line 1946
    .line 1947
    :cond_52
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 1948
    .line 1949
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v1

    .line 1953
    throw v1

    .line 1954
    :cond_53
    :goto_25
    iget v2, v0, Ll6/j;->u:I

    .line 1955
    .line 1956
    const/16 v7, 0x8

    .line 1957
    .line 1958
    if-ne v2, v7, :cond_55

    .line 1959
    .line 1960
    iget-wide v8, v0, Ll6/j;->t:J

    .line 1961
    .line 1962
    cmp-long v2, v8, v5

    .line 1963
    .line 1964
    if-gtz v2, :cond_54

    .line 1965
    .line 1966
    new-instance v2, Lp4/s;

    .line 1967
    .line 1968
    iget-wide v4, v0, Ll6/j;->t:J

    .line 1969
    .line 1970
    long-to-int v5, v4

    .line 1971
    invoke-direct {v2, v5}, Lp4/s;-><init>(I)V

    .line 1972
    .line 1973
    .line 1974
    iget-object v3, v3, Lp4/s;->a:[B

    .line 1975
    .line 1976
    iget-object v4, v2, Lp4/s;->a:[B

    .line 1977
    .line 1978
    const/4 v13, 0x0

    .line 1979
    invoke-static {v3, v13, v4, v13, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1980
    .line 1981
    .line 1982
    iput-object v2, v0, Ll6/j;->v:Lp4/s;

    .line 1983
    .line 1984
    const/4 v11, 0x1

    .line 1985
    iput v11, v0, Ll6/j;->r:I

    .line 1986
    .line 1987
    goto/16 :goto_0

    .line 1988
    .line 1989
    :cond_54
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 1990
    .line 1991
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v1

    .line 1995
    throw v1

    .line 1996
    :cond_55
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 1997
    .line 1998
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v1

    .line 2002
    throw v1

    .line 2003
    :cond_56
    :goto_26
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 2004
    .line 2005
    .line 2006
    move-result-wide v2

    .line 2007
    iget-wide v6, v0, Ll6/j;->t:J

    .line 2008
    .line 2009
    add-long/2addr v2, v6

    .line 2010
    const-wide/16 v6, 0x8

    .line 2011
    .line 2012
    sub-long/2addr v2, v6

    .line 2013
    new-instance v4, Lq4/b;

    .line 2014
    .line 2015
    iget v6, v0, Ll6/j;->s:I

    .line 2016
    .line 2017
    invoke-direct {v4, v6, v2, v3}, Lq4/b;-><init>(IJ)V

    .line 2018
    .line 2019
    .line 2020
    invoke-virtual {v5, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 2021
    .line 2022
    .line 2023
    iget-wide v4, v0, Ll6/j;->t:J

    .line 2024
    .line 2025
    iget v6, v0, Ll6/j;->u:I

    .line 2026
    .line 2027
    int-to-long v6, v6

    .line 2028
    cmp-long v8, v4, v6

    .line 2029
    .line 2030
    if-nez v8, :cond_57

    .line 2031
    .line 2032
    invoke-virtual {v0, v2, v3}, Ll6/j;->e(J)V

    .line 2033
    .line 2034
    .line 2035
    goto/16 :goto_0

    .line 2036
    .line 2037
    :cond_57
    const/4 v13, 0x0

    .line 2038
    iput v13, v0, Ll6/j;->r:I

    .line 2039
    .line 2040
    iput v13, v0, Ll6/j;->u:I

    .line 2041
    .line 2042
    goto/16 :goto_0

    .line 2043
    .line 2044
    :cond_58
    const-string v1, "Atom size less than header length (unsupported)."

    .line 2045
    .line 2046
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v1

    .line 2050
    throw v1
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
    .line 3777
    .line 3778
    .line 3779
    .line 3780
    .line 3781
    .line 3782
    .line 3783
    .line 3784
    .line 3785
    .line 3786
    .line 3787
    .line 3788
    .line 3789
    .line 3790
    .line 3791
    .line 3792
    .line 3793
    .line 3794
    .line 3795
    .line 3796
    .line 3797
    .line 3798
    .line 3799
    .line 3800
    .line 3801
    .line 3802
    .line 3803
    .line 3804
    .line 3805
    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    .line 3866
    .line 3867
    .line 3868
    .line 3869
    .line 3870
    .line 3871
    .line 3872
    .line 3873
    .line 3874
    .line 3875
    .line 3876
    .line 3877
    .line 3878
    .line 3879
    .line 3880
    .line 3881
    .line 3882
    .line 3883
    .line 3884
    .line 3885
    .line 3886
    .line 3887
    .line 3888
    .line 3889
    .line 3890
    .line 3891
    .line 3892
    .line 3893
    .line 3894
    .line 3895
    .line 3896
    .line 3897
    .line 3898
    .line 3899
    .line 3900
    .line 3901
    .line 3902
    .line 3903
    .line 3904
    .line 3905
    .line 3906
    .line 3907
    .line 3908
    .line 3909
    .line 3910
    .line 3911
    .line 3912
    .line 3913
    .line 3914
    .line 3915
    .line 3916
    .line 3917
    .line 3918
    .line 3919
    .line 3920
    .line 3921
    .line 3922
    .line 3923
    .line 3924
    .line 3925
    .line 3926
    .line 3927
    .line 3928
    .line 3929
    .line 3930
    .line 3931
    .line 3932
    .line 3933
    .line 3934
    .line 3935
    .line 3936
    .line 3937
    .line 3938
    .line 3939
    .line 3940
    .line 3941
    .line 3942
    .line 3943
    .line 3944
    .line 3945
    .line 3946
    .line 3947
    .line 3948
    .line 3949
    .line 3950
    .line 3951
    .line 3952
    .line 3953
    .line 3954
    .line 3955
    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    .line 3961
    .line 3962
    .line 3963
    .line 3964
    .line 3965
    .line 3966
    .line 3967
    .line 3968
    .line 3969
    .line 3970
    .line 3971
    .line 3972
    .line 3973
    .line 3974
    .line 3975
    .line 3976
    .line 3977
    .line 3978
    .line 3979
    .line 3980
    .line 3981
    .line 3982
    .line 3983
    .line 3984
    .line 3985
    .line 3986
    .line 3987
    .line 3988
    .line 3989
    .line 3990
    .line 3991
    .line 3992
    .line 3993
    .line 3994
    .line 3995
    .line 3996
    .line 3997
    .line 3998
    .line 3999
    .line 4000
    .line 4001
    .line 4002
    .line 4003
    .line 4004
    .line 4005
    .line 4006
    .line 4007
    .line 4008
    .line 4009
    .line 4010
    .line 4011
    .line 4012
    .line 4013
    .line 4014
    .line 4015
    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
.end method

.method public final h(Lr5/q;)V
    .locals 6

    .line 1
    iget v0, p0, Ll6/j;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x20

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lb5/d0;

    .line 8
    .line 9
    iget-object v2, p0, Ll6/j;->a:Lo6/j;

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, Lb5/d0;-><init>(Lr5/q;Lo6/j;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :cond_0
    iput-object p1, p0, Ll6/j;->H:Lr5/q;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, p0, Ll6/j;->r:I

    .line 19
    .line 20
    iput v1, p0, Ll6/j;->u:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    new-array v2, v2, [Lr5/h0;

    .line 24
    .line 25
    iput-object v2, p0, Ll6/j;->I:[Lr5/h0;

    .line 26
    .line 27
    iget-object v3, p0, Ll6/j;->p:Lr5/h0;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    aput-object v3, v2, v1

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
    and-int/lit8 v0, v0, 0x4

    .line 37
    .line 38
    const/16 v4, 0x64

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v0, v3, 0x1

    .line 43
    .line 44
    const/4 v5, 0x5

    .line 45
    invoke-interface {p1, v4, v5}, Lr5/q;->u(II)Lr5/h0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    aput-object p1, v2, v3

    .line 50
    .line 51
    const/16 v4, 0x65

    .line 52
    .line 53
    move v3, v0

    .line 54
    :cond_2
    iget-object p1, p0, Ll6/j;->I:[Lr5/h0;

    .line 55
    .line 56
    invoke-static {v3, p1}, Lp4/c0;->P(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, [Lr5/h0;

    .line 61
    .line 62
    iput-object p1, p0, Ll6/j;->I:[Lr5/h0;

    .line 63
    .line 64
    array-length v0, p1

    .line 65
    const/4 v2, 0x0

    .line 66
    :goto_1
    if-ge v2, v0, :cond_3

    .line 67
    .line 68
    aget-object v3, p1, v2

    .line 69
    .line 70
    sget-object v5, Ll6/j;->M:Lm4/q;

    .line 71
    .line 72
    invoke-interface {v3, v5}, Lr5/h0;->b(Lm4/q;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object p1, p0, Ll6/j;->c:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    new-array v0, v0, [Lr5/h0;

    .line 85
    .line 86
    iput-object v0, p0, Ll6/j;->J:[Lr5/h0;

    .line 87
    .line 88
    :goto_2
    iget-object v0, p0, Ll6/j;->J:[Lr5/h0;

    .line 89
    .line 90
    array-length v0, v0

    .line 91
    if-ge v1, v0, :cond_4

    .line 92
    .line 93
    iget-object v0, p0, Ll6/j;->H:Lr5/q;

    .line 94
    .line 95
    add-int/lit8 v2, v4, 0x1

    .line 96
    .line 97
    const/4 v3, 0x3

    .line 98
    invoke-interface {v0, v4, v3}, Lr5/q;->u(II)Lr5/h0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lm4/q;

    .line 107
    .line 108
    invoke-interface {v0, v3}, Lr5/h0;->b(Lm4/q;)V

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Ll6/j;->J:[Lr5/h0;

    .line 112
    .line 113
    aput-object v0, v3, v1

    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    move v4, v2

    .line 118
    goto :goto_2

    .line 119
    :cond_4
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final i(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, Ll6/j;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ll6/i;

    .line 16
    .line 17
    invoke-virtual {v2}, Ll6/i;->f()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Ll6/j;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, Ll6/j;->x:I

    .line 29
    .line 30
    iget-object p1, p0, Ll6/j;->o:Lh7/i;

    .line 31
    .line 32
    iget-object p1, p1, Lh7/i;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/util/PriorityQueue;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->clear()V

    .line 37
    .line 38
    .line 39
    iput-wide p3, p0, Ll6/j;->y:J

    .line 40
    .line 41
    iget-object p1, p0, Ll6/j;->m:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    iput v0, p0, Ll6/j;->r:I

    .line 47
    .line 48
    iput v0, p0, Ll6/j;->u:I

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
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll6/j;->q:Lya/a1;

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
