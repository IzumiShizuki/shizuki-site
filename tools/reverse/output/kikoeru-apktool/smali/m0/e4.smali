.class public final Lm0/e4;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lic/o;


# direct methods
.method public constructor <init>(ZLic/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lm0/e4;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lm0/e4;->b:Lic/o;

    .line 7
    .line 8
    return-void
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
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lx0/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_5

    .line 25
    .line 26
    iget-boolean p2, p0, Lm0/e4;->a:Z

    .line 27
    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    const p2, -0x64d7dfd1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lx0/o;->W(I)V

    .line 34
    .line 35
    .line 36
    sget-object p2, Lm0/j1;->a:Lx0/z;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, Lq1/q;

    .line 43
    .line 44
    iget-wide v0, p2, Lq1/q;->a:J

    .line 45
    .line 46
    sget-object p2, Lm0/c1;->a:Lx0/o2;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Lm0/b1;

    .line 53
    .line 54
    invoke-virtual {p2}, Lm0/b1;->j()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    invoke-static {v0, v1}, Lq1/h0;->r(J)F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    float-to-double v0, p2

    .line 67
    cmpl-double p2, v0, v3

    .line 68
    .line 69
    if-lez p2, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-static {v0, v1}, Lq1/h0;->r(J)F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    float-to-double v0, p2

    .line 77
    cmpg-double p2, v0, v3

    .line 78
    .line 79
    if-gez p2, :cond_2

    .line 80
    .line 81
    :goto_1
    const/high16 p2, 0x3f800000    # 1.0f

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const p2, 0x3f5eb852    # 0.87f

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-virtual {p1, v2}, Lx0/o;->p(Z)V

    .line 88
    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    const p2, -0x64d7dced

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p2}, Lx0/o;->W(I)V

    .line 95
    .line 96
    .line 97
    sget-object p2, Lm0/j1;->a:Lx0/z;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Lq1/q;

    .line 104
    .line 105
    iget-wide v0, p2, Lq1/q;->a:J

    .line 106
    .line 107
    sget-object p2, Lm0/c1;->a:Lx0/o2;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Lm0/b1;

    .line 114
    .line 115
    invoke-virtual {p2}, Lm0/b1;->j()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_4

    .line 120
    .line 121
    invoke-static {v0, v1}, Lq1/h0;->r(J)F

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    invoke-static {v0, v1}, Lq1/h0;->r(J)F

    .line 126
    .line 127
    .line 128
    :goto_3
    invoke-virtual {p1, v2}, Lx0/o;->p(Z)V

    .line 129
    .line 130
    .line 131
    const p2, 0x3ec28f5c    # 0.38f

    .line 132
    .line 133
    .line 134
    :goto_4
    sget-object v0, Lm0/h1;->a:Lx0/z;

    .line 135
    .line 136
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {v0, p2}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    new-instance v0, Lm0/p2;

    .line 145
    .line 146
    iget-object v1, p0, Lm0/e4;->b:Lic/o;

    .line 147
    .line 148
    const/4 v2, 0x1

    .line 149
    invoke-direct {v0, v1, v2}, Lm0/p2;-><init>(Lic/o;I)V

    .line 150
    .line 151
    .line 152
    const v1, -0x125dfbb5

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v0, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const/16 v1, 0x38

    .line 160
    .line 161
    invoke-static {p2, v0, p1, v1}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_5
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 166
    .line 167
    .line 168
    :goto_5
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 169
    .line 170
    return-object p1
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
