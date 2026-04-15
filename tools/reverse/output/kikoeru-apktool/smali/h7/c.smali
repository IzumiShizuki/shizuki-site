.class public final Lh7/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Le7/j;

.field public final b:Le7/u;

.field public final c:Landroid/os/Bundle;

.field public d:Landroidx/lifecycle/p;

.field public final e:Le7/m;

.field public final f:Ljava/lang/String;

.field public final g:Landroid/os/Bundle;

.field public final h:Lv2/e;

.field public i:Z

.field public final j:Landroidx/lifecycle/z;

.field public k:Landroidx/lifecycle/p;

.field public final l:Landroidx/lifecycle/q0;

.field public final m:Lub/p;


# direct methods
.method public constructor <init>(Le7/j;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh7/c;->a:Le7/j;

    .line 5
    .line 6
    iget-object v0, p1, Le7/j;->b:Le7/u;

    .line 7
    .line 8
    iput-object v0, p0, Lh7/c;->b:Le7/u;

    .line 9
    .line 10
    iget-object v0, p1, Le7/j;->c:Landroid/os/Bundle;

    .line 11
    .line 12
    iput-object v0, p0, Lh7/c;->c:Landroid/os/Bundle;

    .line 13
    .line 14
    iget-object v0, p1, Le7/j;->d:Landroidx/lifecycle/p;

    .line 15
    .line 16
    iput-object v0, p0, Lh7/c;->d:Landroidx/lifecycle/p;

    .line 17
    .line 18
    iget-object v0, p1, Le7/j;->e:Le7/m;

    .line 19
    .line 20
    iput-object v0, p0, Lh7/c;->e:Le7/m;

    .line 21
    .line 22
    iget-object v0, p1, Le7/j;->f:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lh7/c;->f:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, p1, Le7/j;->g:Landroid/os/Bundle;

    .line 27
    .line 28
    iput-object v0, p0, Lh7/c;->g:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v0, Lm4/z;

    .line 31
    .line 32
    new-instance v1, Lt9/f;

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-direct {v1, v2, p1}, Lt9/f;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p1, v1}, Lm4/z;-><init>(Lw7/e;Lt9/f;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lv2/e;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Lv2/e;-><init>(Lm4/z;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lh7/c;->h:Lv2/e;

    .line 47
    .line 48
    new-instance v0, Le/e;

    .line 49
    .line 50
    const/16 v1, 0x13

    .line 51
    .line 52
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Landroidx/lifecycle/z;

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {v1, p1, v2}, Landroidx/lifecycle/z;-><init>(Landroidx/lifecycle/x;Z)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, Lh7/c;->j:Landroidx/lifecycle/z;

    .line 66
    .line 67
    sget-object p1, Landroidx/lifecycle/p;->b:Landroidx/lifecycle/p;

    .line 68
    .line 69
    iput-object p1, p0, Lh7/c;->k:Landroidx/lifecycle/p;

    .line 70
    .line 71
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Landroidx/lifecycle/q0;

    .line 76
    .line 77
    iput-object p1, p0, Lh7/c;->l:Landroidx/lifecycle/q0;

    .line 78
    .line 79
    new-instance p1, Le/e;

    .line 80
    .line 81
    const/16 v0, 0x14

    .line 82
    .line 83
    invoke-direct {p1, v0}, Le/e;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Lub/a;->d(Lic/a;)Lub/p;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lh7/c;->m:Lub/p;

    .line 91
    .line 92
    return-void
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
.method public final a()Landroid/os/Bundle;
    .locals 3

    .line 1
    iget-object v0, p0, Lh7/c;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    new-array v2, v1, [Lub/k;

    .line 9
    .line 10
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, [Lub/k;

    .line 15
    .line 16
    invoke-static {v1}, Ln7/d;->c([Lub/k;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-object v1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lh7/c;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lh7/c;->h:Lv2/e;

    .line 6
    .line 7
    iget-object v1, v0, Lv2/e;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lm4/z;

    .line 10
    .line 11
    invoke-virtual {v1}, Lm4/z;->a()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lh7/c;->i:Z

    .line 16
    .line 17
    iget-object v1, p0, Lh7/c;->e:Le7/m;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lh7/c;->a:Le7/j;

    .line 22
    .line 23
    invoke-static {v1}, Landroidx/lifecycle/m0;->c(Lw7/e;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lh7/c;->g:Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lv2/e;->t(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lh7/c;->d:Landroidx/lifecycle/p;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lh7/c;->k:Landroidx/lifecycle/p;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iget-object v2, p0, Lh7/c;->j:Landroidx/lifecycle/z;

    .line 44
    .line 45
    if-ge v0, v1, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lh7/c;->d:Landroidx/lifecycle/p;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Landroidx/lifecycle/z;->F1(Landroidx/lifecycle/p;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iget-object v0, p0, Lh7/c;->k:Landroidx/lifecycle/p;

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Landroidx/lifecycle/z;->F1(Landroidx/lifecycle/p;)V

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
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Le7/j;

    .line 7
    .line 8
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Lpc/c;->y()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "("

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lh7/c;->f:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v2, 0x29

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, " destination="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lh7/c;->b:Le7/u;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "toString(...)"

    .line 60
    .line 61
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v0
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
