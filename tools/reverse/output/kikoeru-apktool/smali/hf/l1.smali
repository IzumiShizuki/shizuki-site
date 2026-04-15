.class public final Lhf/l1;
.super Lhf/r1;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final d:Lyb/c;


# direct methods
.method public constructor <init>(Lyb/h;Lic/n;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lhf/a;-><init>(Lyb/h;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p0, p0}, Lud/s;->k(Lic/n;Lyb/c;Lyb/c;)Lyb/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lhf/l1;->d:Lyb/c;

    .line 10
    .line 11
    return-void
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
.method public final e0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhf/l1;->d:Lyb/c;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lud/s;->p(Lyb/c;)Lyb/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lnf/b;->h(Ljava/lang/Object;Lyb/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    instance-of v1, v0, Lhf/h0;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Lhf/h0;

    .line 19
    .line 20
    iget-object v0, v0, Lhf/h0;->a:Ljava/lang/Throwable;

    .line 21
    .line 22
    :cond_0
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0, v1}, Lhf/a;->h(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
