.class public final Lp5/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lce/g;

.field public final c:Lp5/o;

.field public final d:Landroid/util/SparseArray;

.field public final e:Lya/a1;

.field public final f:Lp5/c;

.field public final g:Lp4/v;

.field public final h:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public i:Lp4/x;

.field public j:Landroid/util/Pair;

.field public k:I

.field public l:J

.field public m:J

.field public n:I


# direct methods
.method static constructor <clinit>()V
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

.method public constructor <init>(Lc0/s;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lc0/s;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    iput-object v0, p0, Lp5/p;->a:Landroid/content/Context;

    .line 9
    .line 10
    new-instance v0, Lce/g;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v2, v1}, Lce/g;-><init>(BI)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lp5/p;->b:Lce/g;

    .line 18
    .line 19
    iget-object v0, p1, Lc0/s;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lp5/o;

    .line 22
    .line 23
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lp5/p;->c:Lp5/o;

    .line 27
    .line 28
    new-instance v0, Landroid/util/SparseArray;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lp5/p;->d:Landroid/util/SparseArray;

    .line 34
    .line 35
    iget-object v0, p1, Lc0/s;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lya/a1;

    .line 38
    .line 39
    iput-object v0, p0, Lp5/p;->e:Lya/a1;

    .line 40
    .line 41
    iget-object v0, p1, Lc0/s;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lp4/v;

    .line 44
    .line 45
    iput-object v0, p0, Lp5/p;->g:Lp4/v;

    .line 46
    .line 47
    new-instance v1, Lp5/c;

    .line 48
    .line 49
    iget-object p1, p1, Lc0/s;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lp5/r;

    .line 52
    .line 53
    invoke-direct {v1, p1, v0}, Lp5/c;-><init>(Lp5/r;Lp4/v;)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lp5/p;->f:Lp5/c;

    .line 57
    .line 58
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lp5/p;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 64
    .line 65
    new-instance p1, Lm4/p;

    .line 66
    .line 67
    invoke-direct {p1}, Lm4/p;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lm4/p;->a()Lm4/q;

    .line 71
    .line 72
    .line 73
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    iput-wide v0, p0, Lp5/p;->l:J

    .line 79
    .line 80
    const/4 p1, -0x1

    .line 81
    iput p1, p0, Lp5/p;->n:I

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    iput p1, p0, Lp5/p;->k:I

    .line 85
    .line 86
    return-void
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
