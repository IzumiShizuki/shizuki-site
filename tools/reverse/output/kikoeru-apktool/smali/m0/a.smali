.class public final synthetic Lm0/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FFLf1/f;I)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    iput p4, p0, Lm0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm0/a;->b:F

    iput p2, p0, Lm0/a;->c:F

    iput-object p3, p0, Lm0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly8/i;FF)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lm0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/a;->d:Ljava/lang/Object;

    iput p2, p0, Lm0/a;->b:F

    iput p3, p0, Lm0/a;->c:F

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lm0/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/a;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly8/i;

    .line 9
    .line 10
    move-object v9, p1

    .line 11
    check-cast v9, Lx0/o;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    and-int/lit8 p2, p1, 0x3

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    const/4 v2, 0x1

    .line 23
    if-eq p2, v1, :cond_0

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p2, 0x0

    .line 28
    :goto_0
    and-int/2addr p1, v2

    .line 29
    invoke-virtual {v9, p1, p2}, Lx0/o;->N(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    sget-object v6, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 36
    .line 37
    const/16 p1, 0xc

    .line 38
    .line 39
    int-to-float p1, p1

    .line 40
    const/16 p2, 0xd

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-static {v1, p1, p2}, Landroidx/compose/foundation/layout/a;->b(FFI)Ly/e1;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-virtual {v9, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget p2, p0, Lm0/a;->b:F

    .line 52
    .line 53
    invoke-virtual {v9, p2}, Lx0/o;->c(F)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    or-int/2addr p1, v1

    .line 58
    iget v1, p0, Lm0/a;->c:F

    .line 59
    .line 60
    invoke-virtual {v9, v1}, Lx0/o;->c(F)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    or-int/2addr p1, v2

    .line 65
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez p1, :cond_1

    .line 70
    .line 71
    sget-object p1, Lx0/k;->a:Lx0/r0;

    .line 72
    .line 73
    if-ne v2, p1, :cond_2

    .line 74
    .line 75
    :cond_1
    new-instance v2, Ly8/k;

    .line 76
    .line 77
    invoke-direct {v2, v0, p2, v1}, Ly8/k;-><init>(Ly8/i;FF)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    move-object v4, v2

    .line 84
    check-cast v4, Lic/k;

    .line 85
    .line 86
    const/16 v1, 0x180

    .line 87
    .line 88
    const/16 v2, 0x1fa

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    invoke-static/range {v1 .. v12}, La/a;->g(IILa0/g0;Lic/k;Lj1/f;Lj1/q;Ls/f;Lu/p0;Lx0/o;Ly/h;Ly/d1;Z)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v9}, Lx0/o;->Q()V

    .line 101
    .line 102
    .line 103
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_0
    iget-object v0, p0, Lm0/a;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lf1/f;

    .line 109
    .line 110
    check-cast p1, Lx0/o;

    .line 111
    .line 112
    check-cast p2, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/16 p2, 0x1b7

    .line 118
    .line 119
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    iget v1, p0, Lm0/a;->b:F

    .line 124
    .line 125
    iget v2, p0, Lm0/a;->c:F

    .line 126
    .line 127
    invoke-static {v1, v2, v0, p1, p2}, Lm0/k;->c(FFLf1/f;Lx0/o;I)V

    .line 128
    .line 129
    .line 130
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 131
    .line 132
    return-object p1

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
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
