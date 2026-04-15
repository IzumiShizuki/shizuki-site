.class public abstract Lcom/cnl/kikoeru/data/db/AppDatabase;
.super Ln7/v;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/cnl/kikoeru/data/db/AppDatabase;",
        "Ln7/v;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final l:Lub/p;

.field public final m:Lub/p;

.field public final n:Lub/p;

.field public final o:Lub/p;

.field public final p:Lub/p;

.field public final q:Lub/p;

.field public final r:Lub/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ln7/v;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le9/a;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Le9/a;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->l:Lub/p;

    .line 15
    .line 16
    new-instance v0, Le9/a;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, Le9/a;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->m:Lub/p;

    .line 27
    .line 28
    new-instance v0, Le9/a;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {v0, p0, v1}, Le9/a;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->n:Lub/p;

    .line 39
    .line 40
    new-instance v0, Le9/a;

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    invoke-direct {v0, p0, v1}, Le9/a;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->o:Lub/p;

    .line 51
    .line 52
    new-instance v0, Le9/a;

    .line 53
    .line 54
    const/4 v1, 0x4

    .line 55
    invoke-direct {v0, p0, v1}, Le9/a;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->p:Lub/p;

    .line 63
    .line 64
    new-instance v0, Le9/a;

    .line 65
    .line 66
    const/4 v1, 0x5

    .line 67
    invoke-direct {v0, p0, v1}, Le9/a;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->q:Lub/p;

    .line 75
    .line 76
    new-instance v0, Le9/a;

    .line 77
    .line 78
    const/4 v1, 0x6

    .line 79
    invoke-direct {v0, p0, v1}, Le9/a;-><init>(Lcom/cnl/kikoeru/data/db/AppDatabase;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->r:Lub/p;

    .line 87
    .line 88
    return-void
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


# virtual methods
.method public abstract o()Ld9/g;
.end method

.method public abstract p()Ld9/j;
.end method

.method public abstract q()Ld9/m;
.end method

.method public final r()Ld9/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->o:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld9/j;

    .line 8
    .line 9
    return-object v0
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

.method public final s()Ld9/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->n:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld9/m;

    .line 8
    .line 9
    return-object v0
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

.method public final t()Ld9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->m:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld9/o;

    .line 8
    .line 9
    return-object v0
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

.method public final u()Ld9/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/data/db/AppDatabase;->r:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld9/s;

    .line 8
    .line 9
    return-object v0
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

.method public abstract v()Ld9/o;
.end method

.method public abstract w()Ld9/s;
.end method

.method public abstract x()Ld9/v;
.end method

.method public abstract y()Ld9/x;
.end method
