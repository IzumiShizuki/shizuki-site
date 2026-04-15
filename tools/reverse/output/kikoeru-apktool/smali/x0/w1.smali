.class public final Lx0/w1;
.super Lyb/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lhf/w;


# instance fields
.field public final synthetic b:Li1/c;

.field public final synthetic c:Lx0/x1;


# direct methods
.method public constructor <init>(Li1/c;Lx0/x1;)V
    .locals 1

    .line 1
    sget-object v0, Lhf/v;->a:Lhf/v;

    .line 2
    .line 3
    iput-object p1, p0, Lx0/w1;->b:Li1/c;

    .line 4
    .line 5
    iput-object p2, p0, Lx0/w1;->c:Lx0/x1;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lyb/a;-><init>(Lyb/g;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final o(Ljava/lang/Throwable;Lyb/h;)V
    .locals 4

    .line 1
    new-instance v0, La9/d;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    iget-object v2, p0, Lx0/w1;->b:Li1/c;

    .line 6
    .line 7
    iget-object v3, p0, Lx0/w1;->c:Lx0/x1;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, La9/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lpc/f0;->V(Ljava/lang/Throwable;Lic/a;)Z

    .line 13
    .line 14
    .line 15
    sget-object v0, Lhf/v;->a:Lhf/v;

    .line 16
    .line 17
    iget-object v1, v3, Lx0/x1;->a:Lyb/h;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Lyb/h;->R(Lyb/g;)Lyb/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lhf/w;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p1, p2}, Lhf/w;->o(Ljava/lang/Throwable;Lyb/h;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    throw p1
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
