.class public final Loe/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final c:Ljava/util/Set;


# instance fields
.field public final a:Loe/i;

.field public final b:Lre/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lvc/n;->c:Lbe/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbe/d;->i()Lbe/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lbe/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Lbe/c;->b()Lbe/c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, v0, Lbe/c;->a:Lbe/d;

    .line 14
    .line 15
    invoke-virtual {v0}, Lbe/d;->g()Lbe/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v2, v0}, Lbe/b;-><init>(Lbe/c;Lbe/e;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lud/e;->X(Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Loe/g;->c:Ljava/util/Set;

    .line 27
    .line 28
    return-void
    .line 29
.end method

.method public constructor <init>(Loe/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loe/g;->a:Loe/i;

    .line 5
    .line 6
    iget-object p1, p1, Loe/i;->a:Lre/l;

    .line 7
    .line 8
    new-instance v0, Lbd/a;

    .line 9
    .line 10
    const/16 v1, 0xf

    .line 11
    .line 12
    invoke-direct {v0, v1, p0}, Lbd/a;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lre/l;->c(Lic/k;)Lre/j;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Loe/g;->b:Lre/j;

    .line 20
    .line 21
    return-void
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


# virtual methods
.method public final a(Lbe/b;Loe/d;)Lyc/e;
    .locals 1

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Loe/f;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Loe/f;-><init>(Lbe/b;Loe/d;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Loe/g;->b:Lre/j;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lre/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lyc/e;

    .line 18
    .line 19
    return-object p1
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
.end method
