.class public final Ly6/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lr5/h0;

.field public final b:Z

.field public final c:Z

.field public final d:Landroid/util/SparseArray;

.field public final e:Landroid/util/SparseArray;

.field public final f:Lp4/r;

.field public g:[B

.field public h:I

.field public i:I

.field public j:J

.field public k:Z

.field public l:J

.field public m:Ly6/n;

.field public n:Ly6/n;

.field public o:Z

.field public p:J

.field public q:J

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Lr5/h0;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly6/o;->a:Lr5/h0;

    .line 5
    .line 6
    iput-boolean p2, p0, Ly6/o;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Ly6/o;->c:Z

    .line 9
    .line 10
    new-instance p1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ly6/o;->d:Landroid/util/SparseArray;

    .line 16
    .line 17
    new-instance p1, Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ly6/o;->e:Landroid/util/SparseArray;

    .line 23
    .line 24
    new-instance p1, Ly6/n;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ly6/o;->m:Ly6/n;

    .line 30
    .line 31
    new-instance p1, Ly6/n;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ly6/o;->n:Ly6/n;

    .line 37
    .line 38
    const/16 p1, 0x80

    .line 39
    .line 40
    new-array p1, p1, [B

    .line 41
    .line 42
    iput-object p1, p0, Ly6/o;->g:[B

    .line 43
    .line 44
    new-instance p2, Lp4/r;

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    invoke-direct {p2, p1, p3, p3}, Lp4/r;-><init>([BII)V

    .line 48
    .line 49
    .line 50
    iput-object p2, p0, Ly6/o;->f:Lp4/r;

    .line 51
    .line 52
    iput-boolean p3, p0, Ly6/o;->k:Z

    .line 53
    .line 54
    iput-boolean p3, p0, Ly6/o;->o:Z

    .line 55
    .line 56
    iget-object p1, p0, Ly6/o;->n:Ly6/n;

    .line 57
    .line 58
    iput-boolean p3, p1, Ly6/n;->b:Z

    .line 59
    .line 60
    iput-boolean p3, p1, Ly6/n;->a:Z

    .line 61
    .line 62
    return-void
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


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Ly6/o;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Ly6/o;->n:Ly6/n;

    .line 8
    .line 9
    iget-boolean v3, v0, Ly6/n;->b:Z

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    iget v0, v0, Ly6/n;->e:I

    .line 14
    .line 15
    const/4 v3, 0x7

    .line 16
    if-eq v0, v3, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-ne v0, v3, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean v0, p0, Ly6/o;->s:Z

    .line 26
    .line 27
    :goto_0
    iget-boolean v3, p0, Ly6/o;->r:Z

    .line 28
    .line 29
    iget v4, p0, Ly6/o;->i:I

    .line 30
    .line 31
    const/4 v5, 0x5

    .line 32
    if-eq v4, v5, :cond_3

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    if-ne v4, v2, :cond_4

    .line 37
    .line 38
    :cond_3
    const/4 v1, 0x1

    .line 39
    :cond_4
    or-int v0, v3, v1

    .line 40
    .line 41
    iput-boolean v0, p0, Ly6/o;->r:Z

    .line 42
    .line 43
    return-void
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
