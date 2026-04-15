.class public final Lm0/v0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lq1/h;

.field public final b:Lq1/i;

.field public final c:Lq1/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-static {}, Lq1/j;->a()Lq1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lq1/i;

    .line 6
    .line 7
    new-instance v2, Landroid/graphics/PathMeasure;

    .line 8
    .line 9
    invoke-direct {v2}, Landroid/graphics/PathMeasure;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v2}, Lq1/i;-><init>(Landroid/graphics/PathMeasure;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lq1/j;->a()Lq1/h;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lm0/v0;->a:Lq1/h;

    .line 23
    .line 24
    iput-object v1, p0, Lm0/v0;->b:Lq1/i;

    .line 25
    .line 26
    iput-object v2, p0, Lm0/v0;->c:Lq1/h;

    .line 27
    .line 28
    return-void
    .line 29
.end method
