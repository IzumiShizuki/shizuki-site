.class public final Lte/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lte/k;


# instance fields
.field public final c:Lte/e;

.field public final d:Lee/l;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lte/e;->a:Lte/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lte/l;->c:Lte/e;

    .line 7
    .line 8
    new-instance v0, Lee/l;

    .line 9
    .line 10
    sget-object v1, Lee/l;->d:Lee/c;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lee/l;-><init>(Lte/c;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lte/l;->d:Lee/l;

    .line 16
    .line 17
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
.end method


# virtual methods
.method public final a(Lse/w;Lse/w;)Z
    .locals 4

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x6

    .line 13
    const/4 v2, 0x0

    .line 14
    iget-object v3, p0, Lte/l;->c:Lte/e;

    .line 15
    .line 16
    invoke-static {v2, v0, v3, v1}, Lte/g;->l(ZLte/b;Lte/e;I)Lse/j0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, Lse/w;->x()Lse/w0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2}, Lse/w;->x()Lse/w0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {v0, p1, p2}, Lse/d;->h(Lse/j0;Lve/d;Lve/d;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
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

.method public final b(Lse/w;Lse/w;)Z
    .locals 4

    .line 1
    const-string v0, "subtype"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "supertype"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x6

    .line 13
    const/4 v2, 0x1

    .line 14
    iget-object v3, p0, Lte/l;->c:Lte/e;

    .line 15
    .line 16
    invoke-static {v2, v0, v3, v1}, Lte/g;->l(ZLte/b;Lte/e;I)Lse/j0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, Lse/w;->x()Lse/w0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2}, Lse/w;->x()Lse/w0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-ne p1, p2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0, p1, p2}, Lse/j0;->b(Lve/d;Lve/d;)Z

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lse/j0;->c:Lte/b;

    .line 35
    .line 36
    sget-object v2, Lse/d;->a:Lse/d;

    .line 37
    .line 38
    invoke-virtual {v2, v0, v1, p1, p2}, Lse/d;->f(Lse/j0;Lte/b;Lve/d;Lve/d;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    :goto_0
    return v2
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
