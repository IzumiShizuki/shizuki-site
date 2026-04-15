.class public final Lxc/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lad/c;


# static fields
.field public static final d:Lxc/e;

.field public static final synthetic e:[Lpc/u;

.field public static final f:Lbe/c;

.field public static final g:Lbe/e;

.field public static final h:Lbe/b;


# instance fields
.field public final a:Lbd/h0;

.field public final b:Lic/k;

.field public final c:Lre/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljc/s;

    .line 2
    .line 3
    const-class v1, Lxc/g;

    .line 4
    .line 5
    const-string v2, "cloneable"

    .line 6
    .line 7
    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljc/a0;->g(Ljc/s;)Lpc/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    new-array v1, v1, [Lpc/u;

    .line 21
    .line 22
    aput-object v0, v1, v4

    .line 23
    .line 24
    sput-object v1, Lxc/g;->e:[Lpc/u;

    .line 25
    .line 26
    new-instance v0, Lxc/e;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lxc/g;->d:Lxc/e;

    .line 32
    .line 33
    sget-object v0, Lvc/o;->k:Lbe/c;

    .line 34
    .line 35
    sput-object v0, Lxc/g;->f:Lbe/c;

    .line 36
    .line 37
    sget-object v0, Lvc/n;->c:Lbe/d;

    .line 38
    .line 39
    invoke-virtual {v0}, Lbe/d;->g()Lbe/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lxc/g;->g:Lbe/e;

    .line 44
    .line 45
    invoke-virtual {v0}, Lbe/d;->i()Lbe/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lbe/b;

    .line 50
    .line 51
    invoke-virtual {v0}, Lbe/c;->b()Lbe/c;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v0, v0, Lbe/c;->a:Lbe/d;

    .line 56
    .line 57
    invoke-virtual {v0}, Lbe/d;->g()Lbe/e;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {v1, v2, v0}, Lbe/b;-><init>(Lbe/c;Lbe/e;)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Lxc/g;->h:Lbe/b;

    .line 65
    .line 66
    return-void
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

.method public constructor <init>(Lre/l;Lbd/h0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lxc/g;->a:Lbd/h0;

    .line 5
    .line 6
    sget-object p2, Lxc/f;->b:Lxc/f;

    .line 7
    .line 8
    iput-object p2, p0, Lxc/g;->b:Lic/k;

    .line 9
    .line 10
    new-instance p2, Lbd/i;

    .line 11
    .line 12
    const/16 v0, 0x13

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {p2, v0, p0, p1, v1}, Lbd/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lre/i;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lxc/g;->c:Lre/i;

    .line 24
    .line 25
    return-void
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


# virtual methods
.method public final a(Lbe/b;)Lyc/e;
    .locals 1

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxc/g;->h:Lbe/b;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lbe/b;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lxc/g;->e:[Lpc/u;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    aget-object p1, p1, v0

    .line 18
    .line 19
    iget-object v0, p0, Lxc/g;->c:Lre/i;

    .line 20
    .line 21
    invoke-static {v0, p1}, Ln7/b0;->r(Lre/m;Lpc/u;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lbd/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return-object p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final b(Lbe/c;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxc/g;->f:Lbe/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lbe/c;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lxc/g;->e:[Lpc/u;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    aget-object p1, p1, v0

    .line 18
    .line 19
    iget-object v0, p0, Lxc/g;->c:Lre/i;

    .line 20
    .line 21
    invoke-static {v0, p1}, Ln7/b0;->r(Lre/m;Lpc/u;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lbd/n;

    .line 26
    .line 27
    invoke-static {p1}, Lud/e;->X(Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/util/Collection;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    sget-object p1, Lvb/t;->a:Lvb/t;

    .line 35
    .line 36
    return-object p1
.end method

.method public final c(Lbe/c;Lbe/e;)Z
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lxc/g;->g:Lbe/e;

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Lbe/e;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    sget-object p2, Lxc/g;->f:Lbe/c;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lbe/c;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
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
