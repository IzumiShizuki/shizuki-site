.class public final Lx4/i;
.super Ljava/lang/Exception;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lm4/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm4/q;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lx4/i;->a:Lm4/q;

    return-void
.end method

.method public constructor <init>(Ln4/e;Lm4/q;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, Lx4/i;->a:Lm4/q;

    return-void
.end method
